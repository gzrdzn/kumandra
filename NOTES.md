# Remembering Kotlin's Differences
Although Kotlin has many similarities to other programming languages, 
like all programming languages it also has its own differences.

## Void vs Unit vs Nothing
https://www.baeldung.com/kotlin/void-type

## Extension Methods
https://kotlinlang.org/docs/extensions.html
https://www.baeldung.com/kotlin/extension-methods

## Arrays especially of primitive types
```
val intArray = intArrayOf(5, 4, 3, 2, 1, 0)
val digits = Array(10) { i -> i }
val strDigits = digits as String
```
