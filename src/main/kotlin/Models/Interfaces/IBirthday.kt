package Models.Interfaces

interface IBirthday {

    fun calculateAge(currentyear: Int?=null, birthYear: Int?=null): String

}