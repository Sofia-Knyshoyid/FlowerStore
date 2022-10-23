package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class StoreTest {
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
    public static final int TESTNUM3 = 4;
    /**
     * Test variable.
     */
    public static final int TESTNUM4 = 5;
    /**
     * Test variable.
     */
    public static final int TESTNUM5 = 40;
    /**
     * Test variable.
     */
    public static final int TESTNUM6 = 9;
    /**
     * Flower variable.
     */
    private Flower flower1 = new Flower(TESTNUM1,
            FlowerColor.BLUE, TESTNUM2, FlowerType.TULIP);
    /**
     * Setting new flower.
     */
    private Flower flower2 = new Flower(TESTNUM3,
            FlowerColor.RED, TESTNUM2, FlowerType.CHAMOMILE);
    /**
     * Setting new flower.
     */
    private Flower flower3 = new Flower(TESTNUM3,
            FlowerColor.RED, TESTNUM2, FlowerType.ROSE);
    /**
     * Setting new flower pack.
     */
    private FlowerPack flowerPack1 = new FlowerPack(flower1, TESTNUM4);
    /**
     * Setting new flower pack.
     */
    private FlowerPack flowerPack2 = new FlowerPack(flower2, TESTNUM1);
    /**
     * Setting new store.
     */
    private Store store;

    /**
     * Preparing for tests.
     */
    @BeforeEach
    public void init() {
        store = new Store();
        store.addFlower(TESTNUM1, FlowerColor.BLUE, TESTNUM2,
                FlowerType.TULIP);
        store.addFlower(TESTNUM3, FlowerColor.RED, TESTNUM2,
                FlowerType.CHAMOMILE);
        store.addFlowerPack(flower2, TESTNUM1);
        store.addFlowerBucket(flowerPack1, TESTNUM5);
        store.addFlowerBucket(flowerPack2, TESTNUM6);
    }
    /**
     * Testing flower 1.
     */
    @Test
    public void testFlower1() {
        Flower flowerFound = store.search(flower1);
        Assertions.assertEquals(flower1.getColor(),
                flowerFound.getColor());
        Assertions.assertEquals(flower1.getSepalLength(),
                flowerFound.getSepalLength());
        Assertions.assertEquals(flower1.getFlowerType(),
                flowerFound.getFlowerType());
        Assertions.assertEquals(flower1.getPrice(),
                flowerFound.getPrice());
    }
    /**
     * Testing flower 2.
     */
    @Test
    public void testFlower2() {
        Flower flowerFound = store.search(flower2);
        Assertions.assertEquals(flower2.getColor(),
                flowerFound.getColor());
        Assertions.assertEquals(flower2.getSepalLength(),
                flowerFound.getSepalLength());
        Assertions.assertEquals(flower2.getFlowerType(),
                flowerFound.getFlowerType());
        Assertions.assertEquals(flower2.getPrice(),
                flowerFound.getPrice());
    }
    /**
     * Testing flower 3.
     */
    @Test
    public void testFlower3() {
        Flower flowerFound = store.search(flower3);
        Assertions.assertEquals(null, flowerFound);
    }
    /**
     * Testing flower pack 1.
     */
    @Test
    public void testPack1() {
        FlowerPack flowerPackFound = store.search(flowerPack1);
        Assertions.assertEquals(flowerPackFound, flowerPackFound);
    }
    /**
     * Testing flower pack 2.
     */
    @Test
    public void testPack2() {
        FlowerPack flowerPackFound = store.search(flowerPack2);
        Assertions.assertEquals(flowerPack2.getAmount(),
                flowerPackFound.getAmount());
        Assertions.assertEquals(flowerPack2.getFlower().getSepalLength(),
                flowerPackFound.getFlower().getSepalLength());
        Assertions.assertEquals(flowerPack2.getPrice(),
                flowerPackFound.getPrice());
    }
}

