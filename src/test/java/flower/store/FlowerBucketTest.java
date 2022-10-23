package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;


public class FlowerBucketTest {
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
     * Test variable.
     */
    public static final int TESTNUM_D = 3;
    /**
     * Test variable.
     */
    public static final int TESTNUM_E = 450;
    /**
     * The flower variable.
     */
    private Flower flower = new Flower(TESTNUM_A,
            FlowerColor.BLUE, TESTNUM_B, FlowerType.TULIP);
    /**
     * The flower pack variable.
     */
    private FlowerPack flowerPack = new FlowerPack(flower, TESTNUM_C);
    /**
     * The flower bucket variable.
     */
    private FlowerBucket flowerBucket;

    /**
     * Creating flower bucket object.
     */
    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket(flowerPack, TESTNUM_D);
    }
    /**
     * Testing flower pack.
     */
    @Test
    public void testFlowerPack() {
        Assertions.assertEquals(FlowerType.TULIP,
                flowerBucket.getFlowerPack().getFlower().getFlowerType());
    }
    /**
     * Testing the amount.
     */
    @Test
    public void testAmount() {
        Assertions.assertEquals(TESTNUM_D, flowerBucket.getAmount());
    }
    /**
     * Testing the price.
     */
    @Test
    public void testPrice() {
        Assertions.assertEquals(TESTNUM_E, flowerBucket.getPrice());
    }
}
