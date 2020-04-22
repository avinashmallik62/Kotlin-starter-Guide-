fun main() {
    // Maps

    var dogs = mutableMapOf("Fido" to 8,"sarah" to 17,"Sean" to 6)
//    println(dogs["Fido"])
    dogs["Jersey"] = 52
    for(dog in dogs){
        println(dog.key + " is about " + dog.value + " years old.")
    }

}