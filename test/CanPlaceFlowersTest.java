import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {

    @Test
    void testCanPlaceFlowers() {

        assertTrue(CanPlaceFlowersV2.canPlaceFlowers(new int[]{0},1));
        assertTrue(CanPlaceFlowersV2.canPlaceFlowers(new int[]{0, 0},1));
        assertTrue(CanPlaceFlowersV2.canPlaceFlowers(new int[]{1, 0, 0, 0, 1},1));
        assertTrue(CanPlaceFlowersV2.canPlaceFlowers(new int[]{0, 0, 0, 0, 0},1));
        assertTrue(CanPlaceFlowersV2.canPlaceFlowers(new int[]{0, 0, 0, 0, 1},2));
        assertTrue(CanPlaceFlowersV2.canPlaceFlowers(new int[]{1, 1, 1, 1, 1},0));
        assertTrue(CanPlaceFlowersV2.canPlaceFlowers(new int[]{0, 0, 0, 0, 0},3));

        assertFalse(CanPlaceFlowersV2.canPlaceFlowers(new int[]{1},1));
        assertFalse(CanPlaceFlowersV2.canPlaceFlowers(new int[]{0, 0, 0, 0, 0},4));
        assertFalse(CanPlaceFlowersV2.canPlaceFlowers(new int[]{0, 0, 1, 0, 1},2));
        assertFalse(CanPlaceFlowersV2.canPlaceFlowers(new int[]{0, 1, 0, 1, 0},1));
        assertFalse(CanPlaceFlowersV2.canPlaceFlowers(new int[]{0,1},1));
    }

}
