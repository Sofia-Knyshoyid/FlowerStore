package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class StoreTest {
    private Flower flower1 = new Flower(2, FlowerColor.BLUE, 30, FlowerType.TULIP);
    private Flower flower2 = new Flower(4, FlowerColor.RED, 30, FlowerType.CHAMOMILE);
    private Flower flower3 = new Flower(4, FlowerColor.RED, 30, FlowerType.ROSE);
    private FlowerPack flowerPack1 = new FlowerPack(flower1, 5);
    private FlowerPack flowerPack2 = new FlowerPack(flower2, 2);
    private Store store;

    @BeforeEach
    public void init() {
        store = new Store();
        store.addFlower(2, FlowerColor.BLUE, 30, FlowerType.TULIP);
        store.addFlower(4, FlowerColor.RED, 30, FlowerType.CHAMOMILE);
        store.addFlowerPack(flower2, 2);
        store.addFlowerBucket(flowerPack1, 40);
        store.addFlowerBucket(flowerPack2, 9);
    }
    @Test
    public void testFlower1() {
        Flower flowerFound = store.search(flower1);
        Assertions.assertEquals(flower1.getColor(), flowerFound.getColor());
        Assertions.assertEquals(flower1.getSepalLength(), flowerFound.getSepalLength());
        Assertions.assertEquals(flower1.getFlowerType(), flowerFound.getFlowerType());
        Assertions.assertEquals(flower1.getPrice(), flowerFound.getPrice());
    }
    @Test
    public void testFlower2() {
        Flower flowerFound = store.search(flower2);
        Assertions.assertEquals(flower2.getColor(), flowerFound.getColor());
        Assertions.assertEquals(flower2.getSepalLength(), flowerFound.getSepalLength());
        Assertions.assertEquals(flower2.getFlowerType(), flowerFound.getFlowerType());
        Assertions.assertEquals(flower2.getPrice(), flowerFound.getPrice());
    }
    @Test
    public void testFlower3() {
        Flower flowerFound = store.search(flower3);
        Assertions.assertEquals(null, flowerFound);
    }
    @Test
    public void testPack1() {
        FlowerPack flowerPackFound = store.search(flowerPack1);
        Assertions.assertEquals(flowerPackFound, flowerPackFound);
    }
    @Test
    public void testPack2() {
        FlowerPack flowerPackFound = store.search(flowerPack2);
        Assertions.assertEquals(flowerPack2.getAmount(), flowerPackFound.getAmount());
        Assertions.assertEquals(flowerPack2.getFlower().getSepalLength(), flowerPackFound.getFlower().getSepalLength());
        Assertions.assertEquals(flowerPack2.getPrice(), flowerPackFound.getPrice());
    }
}
