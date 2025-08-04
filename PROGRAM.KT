import kotlin.math.pow
fun main() {
//    println("Pooja Solanki")
//    println("Atmiya University")

//    println("Pooja Solanki")
//    println("Somnath socity-2,street no-7,Raiya road,Rajkot")

//    print("enter first number:")
//    val num1 = readln().toInt()
//    print("enter second number:")
//    val num2 = readln().toInt()
//    println("addition:${num1+num2}")
//    println("subtraction:${num1-num2}")
//    println("multiplication:${num1*num2}")
//    println("division:${num1/num2}")

//    var p = 5000
//    var r = 10
//    var n = 2
//    val si = (p*r*n)/100
//    print(si)

//    print("enter P:")
//    val p = readln().toDouble()
//    print("enter r:")
//    val r = readln().toDouble()
//    print("enter n:")
//    val n = readln().toDouble()
//    val amount = p*(1+r/100).pow(n)
//    val ci = amount - p
//    print(ci)

//    print("enter salary:")
//    val s = readln().toDouble()
//    val bonus = (s*10)/100
//    print(bonus)

//    print("enter value in km:")
//    val km = readln().toDouble()
//    val m = km/1000
//    print(m)

//    print("enter value in km:")
//    val km = readln().toDouble()
//    val m = km*1000
//    val cm = m*100
//    val feet = m*3.28084
//    val inch = feet*12
//    println(m)
//    println(cm)
//    println(feet)
//    println(inch)

//    print("enter r:")
//    val r = readln().toDouble()
//    print("enter h:")
//    val h = readln().toDouble()
//    val V = 3.14*r*r*h
//    print(V)

//    print("enter h:")
//    val h = readln().toDouble()
//    print("enter b:")
//    val b = readln().toDouble()
//    val a = (h*b)/2
//    print(a)

    val a = "hello world"
    for(i in a.length-1 downTo 0) {
        print(a[i])
    }
    println()


}
//if else
fun main(){
    println("enter first number:")
    val num1 = readln().toDouble()
    println("enter second number:")
    val num2 = readln().toDouble()

    println("1.Addition")
    println("2.Subtraction")
    println("3.multiplication")
    println("4.division")
    println("enter your choice:")
    val ch = readln().toInt()

    var result: Double

    if(ch == 1 ) {
        result = num1 + num2
        println(result)
    }
    else if(ch == 2) {
        result = num1 - num2
        println(result)
    }
    else if(ch == 3) {
        result = num1 * num2
        println(result)
    }
    else if(ch == 4) {
        if(num2 != 0.0){
            result = num1 / num2
            println(result)
        }
        else{
            println("not divide")
        }
    }
    else{
        println("invalid choice")
    }
    }
//switch case(when in kotlin)
fun main() {

    println("1.Addition")
    println("2.Subtraction")
    println("3.multiplication")
    println("4.division")
    println("enter your choice:")
    val no= readln().toInt()
    print("enter first number: ")
    val a= readln().toInt()
    print("enter second number:")
    val b= readln().toInt()
    val result = when(no){
        1->a+b
        2->a-b
        3->a*b
        4->a/b
        else->"not valid"
    }
    print(result)
}

//using function
fun main() {
    println("1.Addition")
    println("2.Subtraction")
    println("3.multiplication")
    println("4.division")
    println("enter your choice:")
    val no = readln().toInt()
    print("enter first number: ")
    val a = readln().toInt()
    print("enter second number: ")
    val b = readln().toInt()

    fun Addition(a: Int, b: Int): Int {
        return a + b
    }
    fun Subtraction(a: Int, b: Int): Int {
        return a - b
    }
    fun multiplication(a: Int, b: Int): Int {
        return a * b
    }
    fun division(a: Int, b: Int): Int {
        return a / b
    }
    when (no) {
        1 -> println("Addition: ${Addition(a, b)}")
        2 -> println("Subtraction: ${Subtraction(a, b)}")
        3 -> println("multiplication: ${multiplication(a, b)}")
        4 -> println("division: ${division(a, b)}")
        else -> "not valid"
    }
}
=============================================================================

import kotlin.math.pow
fun main() {
//    println("Pooja Solanki")
//    println("Atmiya University")

//    println("Pooja Solanki")
//    println("Somnath socity-2,street no-7,Raiya road,Rajkot")

//    print("enter first number:")
//    val num1 = readln().toInt()
//    print("enter second number:")
//    val num2 = readln().toInt()
//    println("addition:${num1+num2}")
//    println("subtraction:${num1-num2}")
//    println("multiplication:${num1*num2}")
//    println("division:${num1/num2}")

//    var p = 5000
//    var r = 10
//    var n = 2
//    val si = (p*r*n)/100
//    print(si)

//    print("enter P:")
//    val p = readln().toDouble()
//    print("enter r:")
//    val r = readln().toDouble()
//    print("enter n:")
//    val n = readln().toDouble()
//    val amount = p*(1+r/100).pow(n)
//    val ci = amount - p
//    print(ci)

//    print("enter salary:")
//    val s = readln().toDouble()
//    val bonus = (s*10)/100
//    print(bonus)

//    print("enter value in km:")
//    val km = readln().toDouble()
//    val m = km/1000
//    print(m)

//    print("enter value in km:")
//    val km = readln().toDouble()
//    val m = km*1000
//    val cm = m*100
//    val feet = m*3.28084
//    val inch = feet*12
//    println(m)
//    println(cm)
//    println(feet)
//    println(inch)

//    print("enter r:")
//    val r = readln().toDouble()
//    print("enter h:")
//    val h = readln().toDouble()
//    val V = 3.14*r*r*h
//    print(V)

//    print("enter h:")
//    val h = readln().toDouble()
//    print("enter b:")
//    val b = readln().toDouble()
//    val a = (h*b)/2
//    print(a)


    val a = "hello world"
    for(i in a.length-1 downTo 0) {
        print(a[i])
    }
    println()

}

//pro-12
//fun main(){
//    println("enter n1 choice:")
//    val n1 = readln().toDouble()
//
//    println("enter n2 choice:")
//    val  n2 = readln().toDouble()
//
//    println("1.Addition")
//    println("2.subtraction")
//    println("3.Multiplication")
//    println("4.division")
//
//    println("enter number choice:")
//     var number= readln().toInt()
//
//    var result:Double
//
//
//    if(number == 1 ){
//        result =n1+n2
//        println(result)
//    }
//    else if(number == 2 ){
//        result =n1-n2
//        println(result)
//    }
//    else if(number == 3 ){
//        result =n1*n2
//        println(result)
//    }
//    else if(number == 4 ){
//        result =n1/n2
//        println(result)
//    }
//
//    else{
//        println("error")
//    }
//}
------------------------------------
//pro-13
//using when syntax
// fun main() {
//    println("enter choose")
//    println(" 1-> addition")
//    println(" 2-> subtraction")
//    println(" 3-> multi")
//    println(" 4-> division")
//    val no= readln().toInt()
//    print("enter first value ")
//    val a= readln().toInt()
//    print("enter second ")
//    val b= readln().toInt()
//    val ans = when(no){
//        1->a+b
//        2->a-b
//        3->a*b
//        4->a/b
//        else->"not valid"
//    }
//    print("valu is $a and $b, result is  $ans ")
//}

-------------------------------
fun main(){
    println("enter num1:")
    val a= readln().toInt()
    println("enter num2:")
    val  b = readln().toInt()
    println(" 1-> addition")
    println(" 2-> subtraction")
    println(" 3-> multiplication")
    println(" 4-> division")
    println("enter choice:")
    val ans= readln().toInt()

    fun addition(a: Int ,b:Int):Int{
        return a+b
    }

    fun subtraction(a: Int ,b:Int):Int{
        return a-b
    }

    fun  multiplication(a: Int ,b:Int):Int{
        return a*b
    }

    fun  division(a: Int ,b:Int):Int{
        return a/b
    }

    when (ans) {
        1 -> println("Addition: ${addition(a, b)}")
        2 -> println("Subtraction: ${subtraction(a, b)}")
        3 -> println("multiplication: ${multiplication(a, b)}")
        4 -> println("division: ${division(a, b)}")
        else -> "not valid"

}

}

----------------------------
fun main() {
    print("Enter a string:")
    val input = readln()

    var result = ""
    var insideU = false
    var i = 0

    for(index in input.indices){
        if(index < i) continue

        if(input.startsWith("<I>",index)) {
            insideU = true
            i = index + 3
        } else if (input.startsWith("</I>",index)) {
            insideU = false
            i = index + 4
        } else{
             val c = input[index]
             result += if(insideU) c.uppercaseChar() else c
            i = index + 1
        }
    }
    println(result)
}

