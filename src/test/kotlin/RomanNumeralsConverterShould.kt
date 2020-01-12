import org.amshove.kluent.`should be`
import org.junit.jupiter.api.Test

class RomanNumeralsConverterShould {
    @Test
    fun `convert number one to roman numeral I`() {
        val converter = RomanNumeralConverter()
        converter.convert(1) `should be` "I"
    }
}