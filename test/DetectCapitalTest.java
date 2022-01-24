import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DetectCapitalTest {

    @Test
    void testDetectCapital() {

        assertTrue(DetectCapital.detectCapitalUse("T"));
        assertTrue(DetectCapital.detectCapitalUse("t"));
        assertTrue(DetectCapital.detectCapitalUse("Test"));
        assertTrue(DetectCapital.detectCapitalUse("TEST"));
        assertTrue(DetectCapital.detectCapitalUse("test"));
        assertTrue(DetectCapital.detectCapitalUse("Te st"));

        assertFalse(DetectCapital.detectCapitalUse("TesT"));
        assertFalse(DetectCapital.detectCapitalUse("TEsT"));
        assertFalse(DetectCapital.detectCapitalUse("tesT"));
        assertFalse(DetectCapital.detectCapitalUse("t E s t"));
    }

}
