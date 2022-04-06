fun main(){
    Odd()
    var names= Name(arrayOf("Khloe","Mary","Wanda","Wairimu","Robert","Wanjiru"))
    println(names)
    TheDrink(4)
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
    names.forEach { detail->
        if (detail.length >5){
            name++
        }
    }
    return name
}
fun TheDrink(age:Int){

    if ( age<6){
        println("Takes a glass of Milk")
    }
    else if (age>6 && age <15){
        println("Takes Fanta orange")
    }
    else{
        println("Takes a coke bottle")
    }
}
fun numbers() {
    for (number in 1..100)
        if ((number%3)==0){
            println("Fizz")
        }
        else if ((number%5)==0){
            println("Buzz")
        }
        else {
            if (number%3==0 && number%5==0){
                println("Fizz Buzz")
            }
            else {
                println(number)
            }
        }
}



