import org.amshove.kluent.`should equal`
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class RomanNumeralsConverterShould {
    private lateinit var converter: RomanNumeralConverter

    @BeforeEach
    fun setUp() {
        converter = RomanNumeralConverter()
    }

    @ParameterizedTest
    @CsvSource(
        "1, I",
        "2, II",
        "3, III",
        "4, IV",
        "5, V",
        "6, VI",
        "7, VII",
        "8, VIII",
        "9, IX"
    )
    fun `convert single digit numbers to roman numerals`(number: Int, numeral: String) {
        converter.convert(number) `should equal` numeral
    }
}