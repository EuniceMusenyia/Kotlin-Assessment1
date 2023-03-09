fun main() {
    println(names("senyia","liz"))
//   stats(arrayOf(1,2,4,8,7))
    myName("Eunice")
   println( sentence("Eunice","Kotlin", "inheritance" ))
    numberArray(1,2,5,6)
//    println(numberArray(1,2,3,4).)

    var calculator= Calculator(2,4,8)
    calculator.addition()
    calculator.subtraction()
    calculator.division()
    calculator.multiplication()


}
fun names(firstName:String, lastName: String){
   if (firstName.length==lastName.length)
   {println(firstName[0])}
    else{
       println(lastName[0])}
}
fun numberArray(num1:Int, num2:Int, num3:Int, num4:Int):Int{
    var numStats= num1
    return numStats

}
fun myName(name:String){
    var name = "Eunice"
   println(name.split("E"))

}
fun sentence(name: String, action:String, subject:String): String{
    var sentence1 = "$name enjoys $action $subject"
    return sentence1
}

class Calculator(var num1: Int, var num2: Int, var num3: Int){
    fun addition(){
        println(num1+ num2)
    }
    fun subtraction(){
        println(num3-num1)
    }
    fun division(){
        println(num3/num1)
    }
    fun multiplication(){
        println(num3*num2)
    }
}