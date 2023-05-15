import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() { waterBottle = new WaterBottle(); }

    @Test
    public void hasStartingVolume() {
        assertEquals(100, waterBottle.startingVolume(100));
    }

    @Test
    public void addDrinkRemoves10() {
        assertEquals(90, waterBottle.addDrink(100, 10));
    }

    @Test
    public void reduceVolumeTo0() {
        assertEquals(0, waterBottle.reduceVolume());
    }

    @Test
    public void increaseVolumeTo100() {
        assertEquals(100, waterBottle.fillBottle());
    }

}
