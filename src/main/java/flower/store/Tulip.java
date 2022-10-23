package flower.store;

public class Tulip extends Flower {
    Tulip() {
        super(FlowerType.TULIP);
    }
    Tulip(final double theSepalength, final FlowerColor aColor,
         final double aPrice) {
        super(theSepalength, aColor, aPrice, FlowerType.TULIP);
    }
}
