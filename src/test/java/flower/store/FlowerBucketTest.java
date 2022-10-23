package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;


public class FlowerBucketTest {
    private Flower flower = new Flower(2, FlowerColor.BLUE, 30, FlowerType.TULIP);
    private FlowerPack flowerPack = new FlowerPack(flower, 5);
    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket(flowerPack, 3);
    }
    @Test
    public void testFlowerPack() {
        Assertions.assertEquals(FlowerType.TULIP, flowerBucket.getFlowerPack().getFlower().getFlowerType());
    }
    @Test
    public void testAmount() {
        Assertions.assertEquals(3, flowerBucket.getAmount());
    }
    @Test
    public void testPrice() {
        Assertions.assertEquals(450, flowerBucket.getPrice());
    }
}
