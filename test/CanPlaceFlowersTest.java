import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {

    @Test
    void testCanPlaceFlowers() {

        assertTrue(CanPlaceFlowers.canPlaceFlowers(new int[]{0},1));
        assertTrue(CanPlaceFlowers.canPlaceFlowers(new int[]{0, 0},1));
        assertTrue(CanPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1},1));
        assertTrue(CanPlaceFlowers.canPlaceFlowers(new int[]{0, 0, 0, 0, 0},1));
        assertTrue(CanPlaceFlowers.canPlaceFlowers(new int[]{0, 0, 0, 0, 1},2));
        assertTrue(CanPlaceFlowers.canPlaceFlowers(new int[]{1, 1, 1, 1, 1},0));
        assertTrue(CanPlaceFlowers.canPlaceFlowers(new int[]{0, 0, 0, 0, 0},3));

        assertFalse(CanPlaceFlowers.canPlaceFlowers(new int[]{1},1));
        assertFalse(CanPlaceFlowers.canPlaceFlowers(new int[]{0, 0, 0, 0, 0},4));
        assertFalse(CanPlaceFlowers.canPlaceFlowers(new int[]{0, 0, 1, 0, 1},2));
        assertFalse(CanPlaceFlowers.canPlaceFlowers(new int[]{0, 1, 0, 1, 0},1));
        assertFalse(CanPlaceFlowers.canPlaceFlowers(new int[]{0,1},1));
    }

}
