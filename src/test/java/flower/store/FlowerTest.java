package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;


public class FlowerTest {
    /**
     * The random generator variable.
     */
    private static final Random RANDOM_GENERATOR = new Random();
    /**
     * The maximal price.
     */
    private static final int MAX_PRICE = 100;
    /**
     * The flower will be used in checks.
     */
    private Flower flower;

    /**
     * Setting the flower to new object.
     */
    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    /**
     * The test of price.
     */
    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    /**
     * The test of color.
     */
    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    }

    /**
     * The test of type.
     */
    @Test
    public void testType() {
        FlowerType type = FlowerType.CHAMOMILE;
        flower.setFlowerType(type);
        Assertions.assertEquals(FlowerType.CHAMOMILE, flower.getFlowerType());
    }
}
