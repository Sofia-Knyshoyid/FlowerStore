package flower.store;

public class Rose extends Flower {
    Rose() {
        super(FlowerType.ROSE);
    }
    Rose(final double theSepalength, final FlowerColor aColor,
         final double aPrice) {
        super(theSepalength, aColor, aPrice, FlowerType.ROSE);
    }
}
