package test;

import org.junit.jupiter.api.Test;
import main.BasicUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicUtilsTests {
    @Test
    public void reversingArbitraryStringProducesCorrectResult () {
        Assertions.assertEquals(
                "txet modnar", BasicUtils.reversed("random text")
        );
        Assertions.assertEquals(
                "bd#sa6f3basż;", BasicUtils.reversed(";żsab3f6as#db")
        );
    }
    @Test
    public void reversingNullReturnsNull() {
        Assertions.assertNull(BasicUtils.reversed(null));
    }

    @Test
    public void testArbitraryString() {
        String input = "Andrii";
        int result = BasicUtils.vowelCount(input);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testEmptyString() {
        String input = "";
        int result = BasicUtils.vowelCount(input);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testStringMadeUpFromVowels() {
        String input = "aioueAIOUE";
        int result = BasicUtils.vowelCount(input);
        Assertions.assertEquals(10, result);
    }

    @Test
    public void testStringMadeUpFromConsonants() {
        String input = "GLHFGG";
        int result = BasicUtils.vowelCount(input);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testNullString() {
        String input = null;
        int result = BasicUtils.vowelCount(input);
        Assertions.assertEquals(0, result);
    }
}
