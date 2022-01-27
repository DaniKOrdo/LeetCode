import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    @Test
    void testRotateArray() {

        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, RotateArray.rotate(new int[]{1,2,3,4,5,6,7}, 3));
        assertArrayEquals(new int[]{3,99,-1,-100}, RotateArray.rotate(new int[]{-1,-100,3,99}, 2));

    }

}

