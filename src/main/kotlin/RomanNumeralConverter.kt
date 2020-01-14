class RomanNumeralConverter {
    private val romanNumbers = mapOf(
        1 to "I",
        2 to "II",
        3 to "III",
        4 to "IV",
        5 to "V",
        9 to "IX",
        10 to "X",
        40 to "XL",
        50 to "L"
    )
    fun convert(number: Int): String {
        val numeral = numeralFor(number)
        if (numeral.isEmpty()) {
            return when {
                number < 10 -> {
                    numeralsForOneDigit(number)
                }
                number < 40 -> {
                    return numeralsForTwoDigits(number, 10)
                }
                else -> {
                    return numeralsForTwoDigits(number, 40)
                }
            }
        }
        return numeral
    }

    private fun numeralsForTwoDigits(number: Int, divisor: Int): String {
        val occurrences = number / divisor
        val remainder = number - (divisor * occurrences)
        return numeralFor(divisor).repeat(occurrences) + numeralsForOneDigit(remainder)
    }

    private fun numeralsForOneDigit(number: Int): String {
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
