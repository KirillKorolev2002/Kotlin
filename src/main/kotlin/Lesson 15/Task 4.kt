package org.example.`Lesson 15`

/*
На сайте музыкального магазина есть товары двух категорий:
инструменты и комплектующие к ним. Все товары имеют название и количество
единиц на складе.

Для инструментов есть возможность поиска соответствующих
комплектующих.

Опиши классы для категорий товаров. Создай общий класс  для хранения общих
свойств всех товаров. Имитируй процесс поиска текстовым
сообщением «Выполняется поиск». Для выноса логики поиска используй интерфейс.
 */
fun main() {
    val searchEngine = SearchEngine()
    searchEngine.search("Интерфейсы в Kotlin")
}

private interface Searchable {
    fun search(query: String)
}

private class SearchEngine : Searchable {
    override fun search(query: String) {
        println("Выполняется поиск по запросу: \"$query\"...")
        Thread.sleep(10000)
        println("Поиск завершен.")
    }
}
