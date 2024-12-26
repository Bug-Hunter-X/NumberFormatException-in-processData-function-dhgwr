```kotlin
fun processData(data: String): Int {
    val parts = data.split(',')
    if (parts.size != 2) {
        throw IllegalArgumentException("Data must contain exactly two comma-separated values")
    }
    return parts[0].toInt() + parts[1].toInt() // Potential NumberFormatException
}
```