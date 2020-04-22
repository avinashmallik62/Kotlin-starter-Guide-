fun main() {

    //Nullable

    //? to make it nullable
    var age:Int? = 28
    age = 45
    // turns nullable now
    age = null

    //turns non - nullable now
//    age!!

//    var newNumber = age!!
    if(age!=null){
        age!!
    }
    class Dog{

    }


    var dogs = mapOf("Fido" to 8)

    println(dogs["abc"])
    var myDog:Dog? = Dog()
    myDog = null


    var favCandy:String? = "Snickers"
    favCandy = null
    println(favCandy)


}