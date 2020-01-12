class RomanNumeralConverter {
    fun convert(number: Int): String {
        return (1..number).fold("") {
                result, _ -> result + "I"
        }
    }
}
