fun main(){
    var car = Car("Lambourghini","Beamer","grey",12)
    car.carry(10)
    car.identity()
    println(car.calculateParkingFees(4))
    var bus = Bus("Nissan","SUV","yellow",30)
    println(bus.maxTripFare(50.44))
    println(bus.calculateParkingFees(6))

}

 open class Car (var make: String,var model: String,var color: String,var capacity: Int) {
    fun carry(people: Int) {
        var x = people - capacity;
        if (people <= capacity) {
            println("Carrying $people passengers ")
            println()
        } else {
            println("Over capacity by $x people")
        }
        }
        fun identity(){
            println("I am driving a $color $make $model")
    }
     open fun calculateParkingFees(hours: Int): Int{
     return hours * 20
    }
}

class Bus( make: String,model: String, color: String, capacity: Int):Car(make, model, color, capacity){
    fun maxTripFare(fare: Double):Double{
        return fare * capacity
    }
   override fun calculateParkingFees(hours: Int) : Int{
        return hours * 30
    }
}

