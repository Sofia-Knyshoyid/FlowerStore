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
        price = this.price(aFlowerPack);
    }
    /**
     * The constructor for FlowerBucket (no args).
     */
    public FlowerBucket() {
        amount = 0;
        price = 0;
    }
    /**
     * The price method for defining the price.
     * @param aflowerPack the flower pack
     * @return price (int)
     */
    public int price(final FlowerPack aflowerPack) {
        return amount * aflowerPack.getPrice();
    }
    /**
     * Adding flower pack to an empty flower bucket.
     * @param flowerpack flower pack added.
     */
    public void add(final FlowerPack flowerpack) {
        flowerPack = flowerpack;
        amount += 1;
        price += this.price(flowerpack);
    }
}
