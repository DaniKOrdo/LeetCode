import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidMountainArrayTest {

    @Test
    void testValidMountainArray() {

        assertTrue(ValidMountainArray.validMountainArray(new int[]{0, 1, 0}));
        assertTrue(ValidMountainArray.validMountainArray(new int[]{0, 1, 2, 1}));
        assertTrue(ValidMountainArray.validMountainArray(new int[]{0, 2, 4, 3, 0}));
        assertTrue(ValidMountainArray.validMountainArray(new int[]{2, 3, 5, 3, 1}));

        assertFalse(ValidMountainArray.validMountainArray(new int[]{1, 2}));
        assertFalse(ValidMountainArray.validMountainArray(new int[]{1, 1, 1}));
        assertFalse(ValidMountainArray.validMountainArray(new int[]{0, 1, 1, 0}));
        assertFalse(ValidMountainArray.validMountainArray(new int[]{2, 1, 2, 3}));
        assertFalse(ValidMountainArray.validMountainArray(new int[]{5, 4, 3, 2, 1}));
        assertFalse(ValidMountainArray.validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9}));

    }

}
