```kotlin
fun processData(data: String): Int? {
    val parts = data.split(',')
    if (parts.size != 2) {
        return null //Handle the case where data does not have 2 parts
    }
    return try {
        parts[0].toInt() + parts[1].toInt()
    } catch (e: NumberFormatException) {
        println("Error converting to Integer: ${e.message}")
        null // Or throw a custom exception for better error handling
    }
}
```