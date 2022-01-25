import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void testSearchInsertPosition() {

        assertEquals(1, SearchInsertPosition.searchInsert(new int[]{1,2,3,5,6}, 2));
        assertEquals(3, SearchInsertPosition.searchInsert(new int[]{1,2,3,5,6}, 5));
        assertEquals(0, SearchInsertPosition.searchInsert(new int[]{1,2,3,5,6}, 1));

        assertEquals(1, SearchInsertPosition.searchInsert(new int[]{1,3,5,6}, 2));
        assertEquals(0, SearchInsertPosition.searchInsert(new int[]{1,2,3,5,6}, 0));
        assertEquals(5, SearchInsertPosition.searchInsert(new int[]{1,2,3,5,6}, 7));
    }

}
