# Kotlin MutableList removeIf vs removeAll

This example demonstrates a subtle difference in behavior between `removeIf` and `removeAll` when used with Kotlin's `MutableList`.  While both remove elements, they do so using different criteria.  This can lead to unexpected results if the distinction isn't clearly understood.

The `bug.kt` file showcases this difference; the `bugSolution.kt` file provides clarity and best practices.