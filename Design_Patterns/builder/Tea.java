package builder;

public class Tea {
    private String tea;
    private int amountOfTea;
    private String milkPowder;
    private int amountOfMilkPowder;
    private int sugar;
    @Override
    public String toString() {
        return "Tea{" +
                "tea='" + tea + '\'' +
                ", amountOfTea=" + amountOfTea +
                ", milkPowder='" + milkPowder + '\'' +
                ", amountOfMilkPowder=" + amountOfMilkPowder +
                ", sugar=" + sugar +
                '}';
    }
    public Tea(String tea, int amountOfTea, String milkPowder, int amountOfMilkPowder, int sugar) {
        this.tea = tea;
        this.amountOfTea = amountOfTea;
        this.milkPowder = milkPowder;
        this.amountOfMilkPowder = amountOfMilkPowder;
        this.sugar = sugar;
    }
}
