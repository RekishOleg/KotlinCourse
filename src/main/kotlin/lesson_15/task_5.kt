package lesson_15

const val MAX_TRUCK_CARGO_CAPACITY = 2
const val MAX_TRUCK_PASSENGERS_CAPACITY = 1
const val MAX_PASSENGER_CAR_PASSENGERS_CAPACITY = 3

abstract class Transport(
    val passengerCapacity: Int,
) : PassengerTransport {
    protected var currentPassengers = 0
    override fun passengerBoarding(count: Int) {
        if ((currentPassengers + count) <= passengerCapacity) {
            currentPassengers += count
        } else println("Пассажиры не влазят")
    }

    override fun passengerUnboarding(count: Int) {
        if ((currentPassengers - count) >= 0) {
            currentPassengers -= count
        } else println("Столько пассажиров нет")
    }
}

interface VehicleMovement {
    fun moving()
}

interface PassengerTransport {
    fun passengerBoarding(count: Int)
    fun passengerUnboarding(count: Int)
}

interface CargoTransport {
    fun cargoLoading(count: Int)
    fun cargoUnloading(count: Int)
}

class Truck(
    val cargoCapacity: Int = MAX_TRUCK_CARGO_CAPACITY,
    passengerCapacity: Int = MAX_TRUCK_PASSENGERS_CAPACITY,
) : Transport(passengerCapacity), VehicleMovement, CargoTransport {
    init {
        require(cargoCapacity in 1..MAX_TRUCK_CARGO_CAPACITY) {
            "Грузоподъёмность грузовика не может быть больше $MAX_TRUCK_CARGO_CAPACITY т"
        }
        require(passengerCapacity in 1..MAX_TRUCK_PASSENGERS_CAPACITY) {
            "Грузовик вмещает не больше $MAX_TRUCK_PASSENGERS_CAPACITY пассажира"
        }
    }

    private var currentCargo = 0

    override fun moving() {
        print("Грузовик поехал")
    }

    override fun cargoLoading(count: Int) {
        if ((currentCargo + count) <= cargoCapacity) {
            currentCargo += count
        } else println("Груз не влазит")
    }

    override fun cargoUnloading(count: Int) {
        if ((currentCargo - count) >= 0) {
            currentCargo -= count
        } else println("Столько груза нет")
    }
}

class PassengerCar(
    passengerCapacity: Int = MAX_PASSENGER_CAR_PASSENGERS_CAPACITY,
) : Transport(passengerCapacity), VehicleMovement {
    init {
        require(passengerCapacity in 1..MAX_PASSENGER_CAR_PASSENGERS_CAPACITY) {
            "Пассажирская машина вмещает не больше $MAX_PASSENGER_CAR_PASSENGERS_CAPACITY пассажира"
        }
    }

    override fun moving() {
        print("Легковая машина поехала")
    }
}

fun main() {
    val passengerCar = PassengerCar()
    val truck = Truck()

    truck.cargoLoading(2)
    truck.passengerBoarding(1)
    truck.moving()
    truck.passengerUnboarding(1)
    truck.cargoUnloading(2)

    truck.passengerBoarding(1)
    truck.moving()
    truck.passengerUnboarding(1)

    truck.passengerBoarding(1)
    truck.moving()
    truck.passengerUnboarding(1)

    passengerCar.passengerBoarding(3)
    passengerCar.moving()
    passengerCar.passengerUnboarding(3)

}