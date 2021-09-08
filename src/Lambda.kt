fun main(args: Array<String>) {
    val printMessage = { message:String -> print(message+"\n")};
    printMessage("Hello");

    val sayHello = { message:String, name:String ->
        print(message+" "+name);
    };

    sayHello("Hello","Joy");
}