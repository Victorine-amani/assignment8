

fun isEven(num:Int):Boolean{
    return num %2==0
}
data class Product(var name:String,var weight:Double,var price:Double,var category:String) {
    fun kiosk(category: String) {
        val groceries = mutableListOf("tomato", "apples")
        val hygiene = mutableListOf("Harpic", "omo")
        val other = mutableListOf("toothbrush")

        when (category) {
            "groceries" -> println(groceries.plus(name))
            "hygiene" -> println(hygiene.plus(name))
            "other" -> println(other.plus(name))
        }
    }

}
fun even(name:String):String{
  val x=""
for(i in name){
    if(name.indexOf(i)%2==0){
        print(x.plus(i))

    }
};return x
}
fun evenNames(names:Array<String>):MutableList<String>{
val newNames= mutableListOf<String>()
    for (name in names){
        if(name.length%2==0){
            println(newNames.add(name))

        }
    };return newNames
}


fun main(){
    println(isEven(22))
    val product=Product("watermelon",2.20,30.00,"groceries")
    println(product.kiosk("groceries"))
    println(even("Victorine"))
    println(evenNames(arrayOf("Victorine", "Favour", "Joel", "Elizabeth", "Hezborn")))

}