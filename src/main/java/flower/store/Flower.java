package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    /**
     * The sepal length of a flower.
     */
    @Getter
    private double sepalLength;
    /**
     * The color of the flower.
     */
    private FlowerColor color;
    /**
     * The price of a flower.
     */
    @Getter
    private double price;
    /**
     * The type of the flower.
     */
    @Getter
    private FlowerType flowerType;
    /**
     * The constructor for  Flower.
     * @param aColor flower color.
     * @param aFlowerType type of the flower.
     * @param aPrice price of the flower.
     * @param theSepalength sepal length of a flower.
     */
    public Flower(final double theSepalength, final FlowerColor aColor,
                  final double aPrice, final FlowerType aFlowerType) {
        sepalLength = theSepalength;
        color = aColor;
        price = aPrice;
        flowerType = aFlowerType;
    }
    /**
     * The constructor for a flower with no arguments.
     */
    public Flower() { }

    /**
     * @return the color of the flower.
     */
    public String getColor() {
        return color.toString();
    }
}
