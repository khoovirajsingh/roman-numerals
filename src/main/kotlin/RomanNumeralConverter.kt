class RomanNumeralConverter {
    private val romanNumbers = mapOf(
        1 to "I",
        2 to "II",
        3 to "III",
        4 to "IV",
        5 to "V",
        9 to "IX"
    )
    fun convert(number: Int): String {
        val numeral = numeralFor(number)
        if (numeral.isEmpty()) {
            val remainder = number - 5
            return numeralFor(5) + numeralFor(remainder)
        }
        return numeral
    }

    private fun numeralFor(number: Int) = romanNumbers.getOrDefault(number, "")
}
