open class  Car(val make:String,val model:String){
 fun running(){
     print("$model Of $make Running Broom Broom\n");
 }
 open fun park(){
     print("Car Parking");
 }
}

class Vehicle(val made: String,model: String, val color:String) : Car(made,model){
    override fun park() {
        print("Car Parking From Children \n");
    }
}

fun main(args: Array<String>) {
    var car = Car("Toyota","Avalon");
    car.running();

    val tesla = Vehicle("Tesla","Bullet","Black");

    tesla.running();

    tesla.park();
}