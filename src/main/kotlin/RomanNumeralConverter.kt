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
                val remainder = number - 5
                numeralFor(5) + numeralFor(remainder)
            } else {
                val remainder = number - 10
                numeralFor(10) + numeralFor(remainder)
            }
        }
        return numeral
    }

    private fun numeralFor(number: Int) = romanNumbers.getOrDefault(number, "")
}
