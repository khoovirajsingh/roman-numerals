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

    @ParameterizedTest
    @CsvSource(
        "10, X",
        "11, XI",
        "14, XIV",
        "19, XIX",
        "20, XX",
        "21, XXI",
        "31, XXXI"
    )
    fun `convert teens, twenties and thirties to roman numerals`(number: Int, numeral: String) {
        converter.convert(number) `should equal` numeral
    }

    @ParameterizedTest
    @CsvSource(
        "40, XL",
        "41, XLI",
        "44, XLIV",
        "51, LI",
        "60, LX",
        "61, LXI"
    )
    fun `convert remaining two digit numbers to roman numerals`(number: Int, numeral: String) {
        converter.convert(number) `should equal` numeral
    }

    @ParameterizedTest
    @CsvSource(
        "112, CXII",
        "448, CDXLVIII",
        "544, DXLIV",
        "1001, MI",
        "3000, MMM"
    )
    fun `convert all remaining numbers to roman numerals`(number: Int, numeral: String) {
        converter.convert(number) `should equal` numeral
    }
}