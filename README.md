# Kotlin NumberFormatException Bug

This repository demonstrates a common bug in Kotlin: a `NumberFormatException` that can occur when attempting to convert a string to an integer without proper error handling.  The `processData` function is designed to split a comma-separated string into two integers and return their sum.  However, if the input string does not contain two valid integers, the function throws a `NumberFormatException`.

The solution demonstrates how to use a `try-catch` block to handle potential exceptions and provide more robust error handling.