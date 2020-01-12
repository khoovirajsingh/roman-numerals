class RomanNumeralConverter {
    private val romanNumbers = mapOf(
        1 to "I",
        2 to "II",
        3 to "III",
        4 to "IV",
        5 to "V"
    )
    fun convert(number: Int): String {
        if (number <= 5) return numeralFor(number)
        val remainder = number - 5
        return numeralFor(5) + numeralFor(remainder)
    }

    private fun numeralFor(number: Int) = romanNumbers.getOrDefault(number, "")
}
