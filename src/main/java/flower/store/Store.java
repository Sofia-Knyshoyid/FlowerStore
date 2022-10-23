package flower.store;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Store {
    /**
     * The list of flower search results.
     */
    private List flowerList;
    /**
     * The list of flower packs search results.
     */
    private List flowerPackList;
    /**
     * The list of flower buckets results.
     */
    private List flowerBucketList;

    /**
     * The store constructor.
     */
    public Store() {
        flowerList = new LinkedList();
        flowerPackList = new LinkedList();
        flowerBucketList = new LinkedList();
    }

    // adding flowers to the store:

    /**
     * Adding flower to results.
     *
     * @param newColor      flower color.
     * @param newFlowerType type of the flower.
     * @param newPrice      price of the flower.
     * @param newSepalength sepal length of a flower.
     */
    public void addFlower(final double newSepalength,
                          final FlowerColor newColor,
                          final double newPrice,
                          final FlowerType newFlowerType) {
        Flower flower = new Flower(newSepalength, newColor,
                newPrice, newFlowerType);
        flowerList.add(flower);
    }

    /**
     * Adding flower pack to results.
     *
     * @param newAmount amount of flowers.
     * @param newFlower type of flowers.
     */
    public void addFlowerPack(final Flower newFlower, final int newAmount) {
        FlowerPack flowerPack = new FlowerPack(newFlower, newAmount);
        flowerPackList.add(flowerPack);
    }

    /**
     * Adding flower bucket to results.
     *
     * @param newFlowerPack type of flower packs
     * @param newAmount     amount of flower packs
     */
    public void addFlowerBucket(final FlowerPack newFlowerPack,
                                final int newAmount) {
        FlowerBucket flowerBucket = new FlowerBucket(newFlowerPack, newAmount);
        flowerBucketList.add(flowerBucket);
    }

//    public Flower getFlowers() {
//    }
//
//    public FlowerPack getFlowers() {
//    }
//
//    public FlowerBucket getFlowers() {
//    }

    /**
     * Searching for flower.
     * @param searchFlower flower to find
     * @return found flower
     */
    public Flower search(final Flower searchFlower) {
        for (Iterator i = flowerList.iterator(); i.hasNext();) {
            Flower flower = (Flower) i.next();
            if (searchFlower.getSepalLength() != flower.getSepalLength()) {
                continue;
            }
            if (searchFlower.getColor() != flower.getColor()) {
                continue;
            }
            if (searchFlower.getFlowerType() != flower.getFlowerType()) {
                continue;
            }
            if (searchFlower.getPrice() != flower.getPrice()) {
                continue;
            }
            return flower;
        }
        return null;
    }

    /**
     * Searching for flower pack.
     * @param searchFlowerPack flower pack to find
     * @return found flower pack
     */
    public FlowerPack search(final FlowerPack searchFlowerPack) {
        for (Iterator i = flowerPackList.iterator(); i.hasNext();) {
            FlowerPack flowerPack = (FlowerPack) i.next();
            if (searchFlowerPack.getFlower() != flowerPack.getFlower()) {
                continue;
            }
            if (searchFlowerPack.getAmount() != flowerPack.getAmount()) {
                continue;
            }
            if (searchFlowerPack.getPrice() != flowerPack.getPrice()) {
                continue;
            }
            return flowerPack;
        }
        return null;
    }

    /**
     * Searching for flower bucket.
     * @param searchFlowerBucket flower bucket to find
     * @return found flower bucket
     */
    public FlowerBucket search(final FlowerBucket searchFlowerBucket) {
        for (Iterator i = flowerBucketList.iterator(); i.hasNext();) {
            FlowerBucket flowerBucket = (FlowerBucket) i.next();
            if (searchFlowerBucket.getFlowerPack()
                    != flowerBucket.getFlowerPack()) {
                continue;
            }
            if (searchFlowerBucket.getAmount() != flowerBucket.getAmount()) {
                continue;
            }
            if (searchFlowerBucket.getPrice() != flowerBucket.getPrice()) {
                continue;
            }
            return flowerBucket;
        }
        return null;
    }
}
