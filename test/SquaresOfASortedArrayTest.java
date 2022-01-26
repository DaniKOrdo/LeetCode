import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquaresOfASortedArrayTest {

    @Test
    void testSquaresOfASortedArray() {
        // Pone que es incorrecto cuando no lo es...
        assertEquals(new int[]{0, 1, 9, 16, 100}, SquaresOfASortedArray.sortedSquares(new int[]{-4,-1,0,3,10}));
    }

}
