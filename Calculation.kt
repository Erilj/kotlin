fun main(args: Array<String>) {
    println("Enter first number :")
    val f = readLine()?.toDoubleOrNull()
    if(f ==null) {
        print("don't work")
        return
    }

    println("Enter second number :")
    val s = readLine()?.toDoubleOrNull()
    if(s ==null) {
        print("don't work")
        return
    }

    println("Enter operation (+,-,*,/)")
    val op = readLine()

    val res = when(op){
        "+" -> add(f,s)
        "-" ->sub(f,s)
        "*" -> mult(f,s)
        "/" -> dev(f,s)
        else -> {
            println("Error")
            return
        }
    }

    println("Result of calculation is : $res")
}

fun add(a:Double, b:Double) = a+b
fun sub(a:Double, b:Double) = a-b
fun mult(a:Double, b:Double) = a*b
fun dev(a:Double, b:Double) : Double{
    if(b==0.0){
        print("error: b can't be divide on 0")
    }
    return a/b;
}