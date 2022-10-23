package flower.store;

import lombok.Getter;

public class FlowerBucket {
    /**
     * The type of flower pack used.
     */
    @Getter
    private FlowerPack flowerPack;
    /**
     * The amount of flower packs.
     */
    @Getter
    private int amount;
    /**
     * The price of flower bucket.
     */
    @Getter
    private int price;
    /**
     * The constructor for FlowerBucket.
     * @param aFlowerPack a flower pack type
     * @param anAmount amount of flower packs
     */
    public FlowerBucket(final FlowerPack aFlowerPack,
                        final int anAmount) {
        flowerPack = aFlowerPack;
        amount = anAmount;
        price = this.price();
    }
    /**
     * The price method for defining the price.
     * @return price (int)
     */
    public int price() {
        return amount * flowerPack.getPrice();
    }
}
