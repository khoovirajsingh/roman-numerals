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
            return if (number < 10) {
                numeralsLessThan10(number)
            } else {
                val numberOfTens = number / 10
                val remainder = number - (10 * numberOfTens)
                return numeralFor(10).repeat(numberOfTens) + numeralsLessThan10(remainder)
            }
        }
        return numeral
    }

    private fun numeralsLessThan10(number: Int): String {
        if (number == 0) return ""
        val numeral = numeralFor(number)
        if (numeral.isEmpty()) {
            val remainder = number - 5
            return numeralFor(5) + numeralFor(remainder)
        }
        return numeralFor(number)
    }

    private fun numeralFor(number: Int) = romanNumbers.getOrDefault(number, "")
}
