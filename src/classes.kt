fun main() {
    /*
    class Dog(var name:String,var age:Int){

    }
    var myDog =  Dog("Fido",5)
    */
    class Dog {
        var name:String
        var age:Int
        var furColor:String
        constructor(name: String,age:Int,furColor:String){
            this.name = name
            this.age = age
            this.furColor = furColor
        }
        constructor(){
            name = ""
            age = 0
            furColor = "Black"
        }
        fun dogInfo(){
            println("$name is $age years old and it's furColor is $furColor")
        }
    }
    var myDog = Dog()
    var myDog1 = Dog("Fido",20,"brown")
    myDog1.dogInfo()

}