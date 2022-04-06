fun main(){
    Odd()
    var names= Name(arrayOf("Khloeeh","Mary","Wanda","Wairimu","Robert","Wanjiru"))
    println(names)
    robotserve(5)
    robotserve(14)
    robotserve(17)


    numbers()


}
fun Odd(){
    for (nums in  1..100)
        if ((nums%2)!=0){
            println(nums)
        }
}
fun Name(names:Array<String>):Int {
    var name= 0
    names.forEach { state->
        if (state.length >5){
            name++
        }
    }
    return name
}
fun robotserve(age:Int){

    if ( age<6){
        println("Takes a bottle of  glass of Milk")
    }
    else if (age>6 && age <15){
        println("Takes a bottle of Fanta orange")
    }
    else{
        println("Takes a  bottle of coke ")
    }
}
fun numbers() {
    var number=0
    for (number in 0..100){
        if ((number%3)==0){
            println("Fizz")
        }
        else if ((number%5)==0){
            println("Buzz")
             }
        }

            if (number%3==0 && number%5==0){
                println("Fizz Buzz")
            }

            }





