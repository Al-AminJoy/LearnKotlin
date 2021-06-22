fun main(args: Array<String>) {
    fun test(){
        println("This is test Method");
    }
    test();
    fun makeEntrance(line:String){
        println(line);
    }
    makeEntrance("This Is Line of String");

    fun calculateNumberGays(rabels:Int,ewoks:Int):Int{
        return  rabels+ewoks;
    }
    println(calculateNumberGays(5,2));
}