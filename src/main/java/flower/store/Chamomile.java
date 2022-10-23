package flower.store;

public class Chamomile extends Flower {
    Chamomile() {
        super(FlowerType.CHAMOMILE);
    }
    Chamomile(final double theSepalength,
              final FlowerColor aColor, final double aPrice) {
        super(theSepalength, aColor, aPrice, FlowerType.CHAMOMILE);
    }
}
