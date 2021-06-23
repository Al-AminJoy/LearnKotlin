fun main(args: Array<String>) {
    var name:String ?="Joy";
    name=null;
    val n=if(name!=null) name.length else -1;
    println(n);

    println(name?.length);

    val len=name?.length?:-5;
    println(len);

    val noName=name?:"No Name";
    println(noName);



}
