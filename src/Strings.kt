fun main(args: Array<String>) {
    val str="This is first test";

    println(str);
    var str1="This is\t test";
    println(str1);
    str1="This is\b test";
    println(str1);
    str1="This is\r test";
    println(str1);

    var rawString="""
        |A log time ago
        |i was a student 
        |and now i am a job holder
    """.trimMargin("|");
    println(rawString);
   /* for (char in str){
        println(char);
    }*/
    var isEqual=str.contentEquals("Thi is first test");
    println(isEqual);

    var isContains=str.contains("test",true);
    println(isContains);

    var cropString=str.subSequence(5,10);
    println(cropString);

    println("$str then the length of second String is ${str1.length}");

}