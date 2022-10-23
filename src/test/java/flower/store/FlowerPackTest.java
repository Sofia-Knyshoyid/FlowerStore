package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;


public class FlowerPackTest {
    /**
     * Test variable.
     */
    public static final int TESTNUM1 = 2;
    /**
     * Test variable.
     */
    public static final int TESTNUM2 = 30;
    /**
     * The flower variable.
     */
    private Flower flower = new Flower(TESTNUM1, FlowerColor.BLUE,
            TESTNUM2, FlowerType.TULIP);
    /**
     * The flower pack variable.
     */
    private FlowerPack flowerPack;

    /**
     * Test variable.
     */
    public static final int TESTNUM3 = 5;
    /**
     * Setting new object of flower pack.
     */
    @BeforeEach
    public void init() {
        flowerPack = new FlowerPack(flower, TESTNUM3);
    }

    /**
     * Test result variable.
     */
    public static final int TESTNUM4 = 150;
    /**
     * The result price of flower pack.
     */
    @Test
    public void testFlower() {
        Assertions.assertEquals(FlowerType.TULIP,
                flowerPack.getFlower().getFlowerType());
    }
    /**
     * The test of amount of flowers in flower pack.
     */
    @Test
    public void testAmount() {
        Assertions.assertEquals(TESTNUM3, flowerPack.getAmount());
    }
    /**
     * The test of price of the flower pack.
     */
    @Test
    public void testPrice() {
        Assertions.assertEquals(TESTNUM4, flowerPack.getPrice());
    }
}
