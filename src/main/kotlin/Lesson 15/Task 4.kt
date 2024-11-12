package org.example.`Lesson 15`

abstract class Forum(val name: String, var quantity: Int)
interface Searchable {
    fun searchAccessories(): String
}

class Instrument(name: String, quantity: Int) : Forum(name, quantity), Searchable {
    override fun searchAccessories(): String {
        return "Выполняется поиск..."
    }
}

class Accessory(name: String, quantity: Int) : Forum(name, quantity)

fun main() {
    val guitar = Instrument(name = "Гитара", quantity = 10)
    val stringSet = Accessory(name = "Набор струн", quantity = 50)
    println("${guitar.name} - количество на складе: ${guitar.quantity}")
    println("${stringSet.name} - количество на складе: ${stringSet.quantity}")
    println(guitar.searchAccessories())
}
