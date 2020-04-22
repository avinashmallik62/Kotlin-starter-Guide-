fun main() {
    fun hello(name:String):String{
        return("Hello $name")
    }
    println(hello("Avinash"))

//    fun add(a:Int,b:Int):Int{
//        return a + b;
//    }

    fun add(a:Int,b:Int):Int = a+ b
    println(add(2,3))

    fun dogsInfo(name:String,age:Int):String{
        return "$name is $age years old"
    }
    println(dogsInfo("Fido",20))

}