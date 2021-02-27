fun main() {

    name()

    var result=div(15,6)
    println(result)

    var ans=sum(15,45,20,99)
    println(ans)

    fact()



}

fun name() {

    var firstname="Shadya"
    println("Hello $firstname")
}

fun div(a:Int,b:Int):Int{
    var answer=a%b
    return answer

}
fun sum(c:Int,d:Int,e:Int,f:Int):Int{
    var add=c+d+e+f
    return add
}

fun fact(){
    println("I love being alone")

}

