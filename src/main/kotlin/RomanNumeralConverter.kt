class RomanNumeralConverter {
    private val romanNumbers = mapOf(
        1 to "I",
        2 to "II",
        3 to "III",
        4 to "IV",
        5 to "V",
        9 to "IX",
        10 to "X"
    )
    fun convert(number: Int): String {
        val numeral = numeralFor(number)
        if (numeral.isEmpty()) {
            return if (number >= 10) {
                buildNumerals(number, 10)
            } else {
                buildNumerals(number, 5)
            }
        }
        return numeral
    }

    private fun buildNumerals(number: Int, remain: Int): String {
        val remainder = number - remain
        return numeralFor(remain) + numeralFor(remainder)
    }

    private fun numeralFor(number: Int) = romanNumbers.getOrDefault(number, "")
}
