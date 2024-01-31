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

## Generics
https://kotlinlang.org/docs/generics.html
https://typealias.com/guides/star-projections-and-how-they-work/
I need to revisit the uses of Generics in Kotlin.

Using spread operator
https://kotlinlang.org/docs/functions.html#variable-number-of-arguments-varargs
https://stackoverflow.com/questions/39389003/kotlin-asterisk-operator-before-variable-name-or-spread-operator-in-kotlin
