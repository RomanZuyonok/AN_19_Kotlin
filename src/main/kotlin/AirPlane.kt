abstract class AirPlane {
    abstract val image: String
    abstract val model: String
    var capacity: Int = 120

    abstract fun takeOff()


    abstract fun loading()

   abstract fun fly()


    abstract fun landing()

}