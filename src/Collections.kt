fun main(args: Array<String>) {
    //Immutable
    val data = listOf("My", "Name", "is", "Joy");
    println(data);
    println(data.sorted());
    println(data[2]);
    println(data.last());
    println(data.contains("is"));
    //Mutable
    val rebel = arrayListOf("Guys","This","Is","Joy");
    println(rebel.size);
    rebel.add("Vai");
    println(rebel.size);
    rebel.add(0,"Hello");
    println(rebel);
    println(rebel.indexOf("Guys"));
    rebel.remove("Vai");
    println(rebel);
    val rebelMap= mapOf("Al-Amin" to "0174","Joy" to "0152");
    println(rebelMap["Al-Amin"]);
    println(rebelMap.getOrDefault("Amin","Not Found"));

    val rebelHasMap= hashMapOf("num1" to "0174","num2" to "0152");
    rebelHasMap["num2"]="0194";
    rebelHasMap.put("num3","0185");
    println(rebelHasMap);
    rebelHasMap.remove("num3");
    println(rebelHasMap);
}