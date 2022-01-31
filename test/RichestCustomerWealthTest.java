import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RichestCustomerWealthTest {

    @Test
    void testRichestCustomerWealth() {

        assertEquals(RichestCustomerWealth.maximumWealth(new int[][] {{1,2,3},{3,2,1}}), 6);
        assertEquals(RichestCustomerWealth.maximumWealth(new int[][] {{1,5},{7,3},{3,5}}), 10);
        assertEquals(RichestCustomerWealth.maximumWealth(new int[][] {{2,8,7},{7,1,3},{1,9,5}}), 17);
        assertEquals(RichestCustomerWealth.maximumWealth(new int[][] {{1,1,1}}), 3);
    }

}



