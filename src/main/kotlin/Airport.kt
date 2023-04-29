fun main(args: Array<String>) {

    val airPort: MutableList<AirPlane> = mutableListOf<AirPlane>()
    airPort.add(Boeing777())
    airPort.add(Boeing747F())
    airPort.add(Airbus350())

    for (item in airPort)
        println(item.model)

    for (item in airPort) {
        item.landing()
    }
    if (!airPort.isEmpty()) {
        airPort.get(0).takeOff()
    }
}

class Boeing777 : Passenger() {
    override val image: String = "Boeing.jpg"
    override val model: String = "777-300ER"

    override fun takeOff() {
        println("Airplane $model takes off....")
    }

    override fun fly() {
        println("The plane $model is flying....")
    }

    override fun landing() {
        println("Airplane $model landing....")
    }
}

class Airbus350 : Passenger() {
    override val image: String = "Airbus.jpg"
    override val model: String = "A-350NEO"

    override fun takeOff() {
        println("Airplane $model takes off....")
    }

    override fun fly() {
        println("The plane $model is flying....")
    }

    override fun landing() {
        println("Airplane $model landing....")
    }
}

class Boeing747F : Cargo() {
    override val image: String = "Boeing.jpg"
    override val model: String = "747F"

    override fun takeOff() {
        println("Airplane $model takes off....")
    }

    override fun fly() {
        println("The plane $model is flying....")
    }

    override fun landing() {
        println("Airplane $model landing....")
    }
}

