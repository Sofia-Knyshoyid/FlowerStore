package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;


public class FlowerPackTest {
    private Flower flower = new Flower(2, FlowerColor.BLUE, 30, FlowerType.TULIP);
    private FlowerPack flowerPack;

    @BeforeEach
    public void init() {
        flowerPack = new FlowerPack(flower, 5);
    }


    @Test
    public void testFlower() {
        Assertions.assertEquals(FlowerType.TULIP, flowerPack.getFlower().getFlowerType());
    }
    @Test
    public void testAmount() {
        Assertions.assertEquals(5, flowerPack.getAmount());
    }
    @Test
    public void testPrice() {
        Assertions.assertEquals(150, flowerPack.getPrice());
    }
}
