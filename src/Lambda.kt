fun main(args: Array<String>) {
    val printMessage = { message:String -> print(message+"\n")};
    printMessage("Hello");

    val sayHello = { message:String, name:String ->
        println(message+" "+name);
    };

    sayHello("Hello","Joy");

    fun downloadData (url:String, completion:()-> Unit){
        //start download
        //complete download
        completion();
    }
    downloadData("www.fakeUrl.com") { println("After Fake download Complete") }


    fun downloadCarData (url:String,completion:(Car) -> Unit){
        //start download
        //complete download
        val car = Car("Tesla","Node");

        completion (car);
    }

    downloadCarData("FakeUrl") { car ->
        println(car.make) ;
        println(car.model);
    }

    fun downloadCarInfo (url:String , completion :(Car?,Boolean)->Unit){
        val colored = true;
        if (colored){
            val car = Car("Tesla","Fade");
            completion(car,true)
        }else{
            completion(null,false);
        }
    }

    downloadCarInfo("FakeUrl"){ car,success->
        if (success){
            println(car?.model+" Car Colored");
        }else{
            println(car?.model+" Car Not Colored");
        }
    }
}