import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void testBinarySearch() {

        assertEquals(0, BinarySearch.search(new int[]{0}, 0));
        assertEquals(1, BinarySearch.search(new int[]{0,1}, 1));
        assertEquals(0, BinarySearch.search(new int[]{-1,0,1}, -1));
        assertEquals(4, BinarySearch.search(new int[]{0,3,5,9,10}, 10));

        assertEquals(-1, BinarySearch.search(new int[]{-1,0,2}, 1));
        assertEquals(-1, BinarySearch.search(new int[]{-1,0,2}, -2));
        assertEquals(-1, BinarySearch.search(new int[]{-1,0,2}, 3));
    }

}
