import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void testSearchInsertPosition() {

        assertEquals(1, SearchInsertPosition.searchInsert(new int[]{1,2,3,5,6}, 2));
    }

}
