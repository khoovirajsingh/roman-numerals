class RomanNumeralConverter {
    private val romanNumbers = mapOf(
        1 to "I",
        2 to "II",
        3 to "III",
        4 to "IV",
        5 to "V"
    )
    fun convert(number: Int): String {
        return romanNumbers.getOrDefault(number, "")
    }
}
