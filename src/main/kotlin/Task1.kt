fun main(args: Array<String>) {

    var dog_1 = Dog(false, "Dog_1", 50.00, 150.0, null)
    var cat_1 = Cat(true, "Cat_1", 25.00, 100.0, null)

    println("\n")

    println(dog_1.Info())
    println(dog_1.isWild())
    println(dog_1.Friendly(true))
    println("The age of the dog: ${dog_1.calculateAge(2024, 2008)}")

    println("\n")

    println(cat_1.Info())
    println(cat_1.isUngrateful())
    println(cat_1.Sweety(false))
    println("The age of the cat: ${cat_1.calculateAge(2024, 2000)}")

    println("\n----------------------------------------------------------\n")

    var dog_2 = Dog(null, "Dog_2", 75.00, 200.0, null)
    var cat_2 = Cat(null, "Cat_2", 50.00, 100.0, null)

    println(dog_2.Info())
    println(dog_2.isWild())
    println(dog_2.Friendly())
    println("The age of the dog: ${dog_2.calculateAge(2024, null)}")

    println("\n")

    println(cat_2.Info())
    println(cat_2.isUngrateful())
    println(cat_2.Sweety())
    println("The age of the cat: ${cat_2.calculateAge(null, 2000)}")

    var dog_3 = Dog(null, "Dog_3", 75.00, 200.0, arrayListOf(dog_1,dog_2))
    var cat_3 = Cat(null, "Cat_3", 50.00, 100.0, arrayListOf(cat_1,cat_2))

    println(dog_3.Info())
    println(dog_3.isWild())
    println(dog_3.Friendly())
    println("The age of the dog: ${dog_3.calculateAge(2024, null)}")

    println("\n")

    println(cat_3.Info())
    println(cat_3.isUngrateful())
    println(cat_3.Sweety())
    println("The age of the cat: ${cat_3.calculateAge(null, 2000)}")
}
