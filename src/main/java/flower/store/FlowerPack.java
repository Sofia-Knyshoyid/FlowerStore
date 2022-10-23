package flower.store;

import lombok.Getter;

public class FlowerPack {
    /**
     * The type of flower used.
     */
    @Getter
    private Flower flower;
    /**
     * The amount of flowers.
     */
    @Getter
    private int amount;
    /**
     * The price of flower pack.
     */
    private int price;
    FlowerPack(final Flower aFlower, final int theAmount) {
        flower = aFlower;
        amount = theAmount;
        price = amount * (int) flower.getPrice();
    }
    /**
     * Get the price of a flower pack.
     * @return amount (int).
     */
    public int getPrice() {
        return price;
    }
}
