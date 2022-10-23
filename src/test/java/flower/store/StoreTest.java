package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class StoreTest {
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
    public static final int TESTNUM_C = 4;
    /**
     * Test variable.
     */
    public static final int TESTNUM_D = 5;
    /**
     * Test variable.
     */
    public static final int TESTNUM_E = 40;
    /**
     * Test variable.
     */
    public static final int TESTNUM_F = 9;
    /**
     * Flower variable.
     */
    private Flower flowerA = new Flower(TESTNUM_A,
            FlowerColor.BLUE, TESTNUM_B, FlowerType.TULIP);
    /**
     * Setting new flower.
     */
    private Flower flowerB = new Flower(TESTNUM_C,
            FlowerColor.RED, TESTNUM_B, FlowerType.CHAMOMILE);
    /**
     * Setting new flower.
     */
    private Flower flowerC = new Flower(TESTNUM_C,
            FlowerColor.RED, TESTNUM_B, FlowerType.ROSE);
    /**
     * Setting new flower pack.
     */
    private FlowerPack flowerPackA = new FlowerPack(flowerA, TESTNUM_D);
    /**
     * Setting new flower pack.
     */
    private FlowerPack flowerPackB = new FlowerPack(flowerB, TESTNUM_A);
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
        store.addFlower(TESTNUM_A, FlowerColor.BLUE, TESTNUM_B,
                FlowerType.TULIP);
        store.addFlower(TESTNUM_C, FlowerColor.RED, TESTNUM_B,
                FlowerType.CHAMOMILE);
        store.addFlowerPack(flowerB, TESTNUM_A);
        store.addFlowerBucket(flowerPackA, TESTNUM_E);
        store.addFlowerBucket(flowerPackB, TESTNUM_F);
    }
    /**
     * Testing flower 1.
     */
    @Test
    public void testFlowerA() {
        Flower flowerFound = store.search(flowerA);
        Assertions.assertEquals(flowerA.getColor(),
                flowerFound.getColor());
        Assertions.assertEquals(flowerA.getSepalLength(),
                flowerFound.getSepalLength());
        Assertions.assertEquals(flowerA.getFlowerType(),
                flowerFound.getFlowerType());
        Assertions.assertEquals(flowerA.getPrice(),
                flowerFound.getPrice());
    }
    /**
     * Testing flower 2.
     */
    @Test
    public void testFlowerB() {
        Flower flowerFound = store.search(flowerB);
        Assertions.assertEquals(flowerB.getColor(),
                flowerFound.getColor());
        Assertions.assertEquals(flowerB.getSepalLength(),
                flowerFound.getSepalLength());
        Assertions.assertEquals(flowerB.getFlowerType(),
                flowerFound.getFlowerType());
        Assertions.assertEquals(flowerB.getPrice(),
                flowerFound.getPrice());
    }
    /**
     * Testing flower 3.
     */
    @Test
    public void testFlowerC() {
        Flower flowerFound = store.search(flowerC);
        Assertions.assertEquals(null, flowerFound);
    }
    /**
     * Testing flower pack 1.
     */
    @Test
    public void testPackA() {
        FlowerPack flowerPackFound = store.search(flowerPackA);
        Assertions.assertEquals(flowerPackFound, flowerPackFound);
    }
    /**
     * Testing flower pack 2.
     */
    @Test
    public void testPackB() {
        FlowerPack flowerPackFound = store.search(flowerPackB);
        Assertions.assertEquals(flowerPackB.getAmount(),
                flowerPackFound.getAmount());
        Assertions.assertEquals(flowerPackB.getFlower().getSepalLength(),
                flowerPackFound.getFlower().getSepalLength());
        Assertions.assertEquals(flowerPackB.getPrice(),
                flowerPackFound.getPrice());
    }
}
