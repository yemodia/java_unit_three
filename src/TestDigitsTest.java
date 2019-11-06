
import org.junit.Test;

import static org.junit.Assert.*;

public class TestDigitsTest {

    @Test
    public void testDigits() {
        assertEquals(true, ShareDigit.sharedigit(14, 43));
        assertEquals(true, ShareDigit.sharedigit(99, 39));
        assertEquals(false, ShareDigit.sharedigit(22, 65));
        assertEquals(false, ShareDigit.sharedigit(11, 88));
    }
}
