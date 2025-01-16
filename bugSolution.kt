fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    // Use removeIf to remove elements based on a condition
    list.removeIf { it > 2 }
    println("removeIf: "+ list) // Output: [1, 2]

    val list2 = mutableListOf<Int>(1,2,3,4,5)
    //Use removeAll to remove elements that are contained in another collection. 
    list2.removeAll { it > 2 }
    println("removeAll: "+list2) //Output: [1,2]
    
    //To avoid confusion, clearly comment your code explaining what each method does.
} 