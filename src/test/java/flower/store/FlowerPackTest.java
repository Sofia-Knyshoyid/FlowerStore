package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;


public class FlowerPackTest {
    /**
     * Test variable.
     */
    public static final int TESTNUM_A = 2;
    /**
     * Test variable.
     */
    public static final int TESTNUM_B = 30;
    /**
     * Test variable.
     */
    public static final int TESTNUM_C = 5;
    /**
     * Test result variable.
     */
    public static final int TESTNUM_D = 150;
    /**
     * The flower variable.
     */
    private Flower flower = new Flower(TESTNUM_A, FlowerColor.BLUE,
            TESTNUM_B, FlowerType.TULIP);
    /**
     * The flower pack variable.
     */
    private FlowerPack flowerPack;
    /**
     * Setting new object of flower pack.
     */
    @BeforeEach
    public void init() {
        flowerPack = new FlowerPack(flower, TESTNUM_C);
    }
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
        Assertions.assertEquals(TESTNUM_C, flowerPack.getAmount());
    }
    /**
     * The test of price of the flower pack.
     */
    @Test
    public void testPrice() {
        Assertions.assertEquals(TESTNUM_D, flowerPack.getPrice());
    }
}
