package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;


public class FlowerBucketTest {
    /**
     * Test variable.
     */
    public static final int TESTNUM1 = 2;
    /**
     * Test variable.
     */
    public static final int TESTNUM2 = 30;
    /**
     * Test variable.
     */
    public static final int TESTNUM3 = 5;
    /**
     * Test variable.
     */
    public static final int TESTNUM4 = 3;
    /**
     * Test variable.
     */
    public static final int TESTNUM5 = 450;
    /**
     * The flower variable.
     */
    private Flower flower = new Flower(TESTNUM1,
            FlowerColor.BLUE, TESTNUM2, FlowerType.TULIP);
    /**
     * The flower pack variable.
     */
    private FlowerPack flowerPack = new FlowerPack(flower, TESTNUM3);
    /**
     * The flower bucket variable.
     */
    private FlowerBucket flowerBucket;

    /**
     * Creating flower bucket object.
     */
    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket(flowerPack, TESTNUM4);
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
    public void testAmount()
    {
        Assertions.assertEquals(TESTNUM4, flowerBucket.getAmount());
    }
    /**
     * Testing the price.
     */
    @Test
    public void testPrice()
    {
        Assertions.assertEquals(TESTNUM5, flowerBucket.getPrice());
    }
}
