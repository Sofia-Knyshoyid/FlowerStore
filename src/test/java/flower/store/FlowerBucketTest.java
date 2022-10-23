package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlowerBucketTest {
    /**
     * The random generator.
     */
    private static final Random RANDOM_GENERATOR = new Random();
    /**
     * The maximal quantity.
     */
    private static final int MAX_QUANTITY = 1000;
    /**
     * The maximal price.
     */
    private static final int MAX_PRICE = 100;
    /**
     * The flower bucket var.
     */
    private FlowerBucket flowerBucket;

    /**
     * Set flower bucket var.
     */
    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    /**
     * Test price.
     */
    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Rose();
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);
        Assertions.assertEquals(price * quantity, flowerBucket.getPrice());
    }
}
