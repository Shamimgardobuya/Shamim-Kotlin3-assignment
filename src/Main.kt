@file:Suppress("UNUSED_LAMBDA_EXPRESSION")

fun main() {
      var name1 = "akirachix"
    var char1 = name1[0]
    var char2 = name1[2]
    var char3 = name1[3]
    var result = "$char1 $char2$char3"
    println(result)
   // greeting("Shamim", 20)
    var stmt1 = "Hi,my name is "
    var stmt2 = "and i am "
    var stmt3 = "years old "
    val age = 20
    var name2 = "Shamim"
    var combined = stmt1+""+name2+""+stmt2+""+age+""+stmt3
    println(combined)

   var namee = "James"
    var name2b = "Anne"
    if (namee == name2b)
    println("That's  me!")
    else {
        println("I don't know who that is")
        var name = "Wendy"
        println("length of the string is: " + name.length)
    }




/*fun greeting(name:String,age:Int): String {

    var stmt1 = "Hi,my name is "
    var stmt2 = "and i am "
    var stmt3 = "years old "
    var combined = stmt1 + "" + name + "" + stmt2 + "" + age + "" + stmt3
    return combined */

}











        