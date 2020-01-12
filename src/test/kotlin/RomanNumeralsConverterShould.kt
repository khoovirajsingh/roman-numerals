import org.amshove.kluent.`should be`
import org.junit.jupiter.api.Test

class RomanNumeralsConverterShould {
    @Test
    fun `convert number one to roman numeral I`() {
        val converter = RomanNumeralConverter()
        converter.convert(1) `should be` "I"
    }

    @Test
    fun `convert number two to roman numeral II`() {
        val converter = RomanNumeralConverter()
        converter.convert(2) `should be` "II"
    }
}