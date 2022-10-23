package flower.store;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), BLUE("#0000FF");
    /**
     * The string representation of a color.
     */
    private final String stringRepresentation;

    FlowerColor(final String aStringRepresentation) {
        this.stringRepresentation = aStringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
