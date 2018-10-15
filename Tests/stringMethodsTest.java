import org.junit.Test;

import static org.junit.Assert.*;

public class stringMethodsTest {

    @Test
    public void alternateStrings1() {
        String result = stringMethods.alternateStrings("abc", "xyz");
        assertEquals("axbycz", result);
    }

    @Test
    public void alternateStrings2() {
        String result = stringMethods.alternateStrings("Hi", "There");
        assertEquals("HTihere", result);
    }

    @Test
    public void alternateStrings3() {
        String result = stringMethods.alternateStrings("xxxx", "Thereee");
        assertEquals("xTxhxexreee", result);
    }

    @Test
    public void alternateStrings4() {
        String result = stringMethods.alternateStrings("Thereee", "xxxx");
        assertEquals("Txhxexrxeee", result);
    }

    @Test
    public void alternateStrings5() {
        String result = stringMethods.alternateStrings("", "");
        assertEquals("", result);
    }

    @Test
    public void abcTest1() {
        boolean result = stringMethods.abcTest("123abc");
        assertEquals(true, result);
    }

    @Test
    public void abcTest2() {
        boolean result = stringMethods.abcTest("123.abc");
        assertEquals(false, result);
    }

    @Test
    public void abcTest3() {
        boolean result = stringMethods.abcTest("abc.123");
        assertEquals(true, result);
    }

    @Test
    public void abcTest4() {
        boolean result = stringMethods.abcTest("");
        assertEquals(false, result);
    }

}
