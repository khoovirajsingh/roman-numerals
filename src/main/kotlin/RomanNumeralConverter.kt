class RomanNumeralConverter {
    fun convert(number: Int): String {
        var result = ""
        for(value in 1..number) result += "I"
        return result
    }
}
