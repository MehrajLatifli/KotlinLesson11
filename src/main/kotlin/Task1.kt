fun main(args: Array<String>) {


    var dog = Dog(false,"Dog_1",50.00,150.0)

    var cat = Cat(true,"Cat_1",25.00,100.0)

    println(dog.Info())
    println(cat.Info())
    println(cat.Sweety(false))
    println(dog.Friendly(true))

    println(cat.calculateBirthday(2024,2000))
    println(dog.calculateBirthday(2020,2000))
}