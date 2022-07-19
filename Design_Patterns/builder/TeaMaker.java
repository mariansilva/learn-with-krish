package builder;

public class TeaMaker {
    private String tea;
    private int amountOfTea;
    private String milkPowder;
    private int amountOfMilkPowder;
    private int sugar;

    public TeaMaker setTea(String tea) {
        this.tea = tea;
        return this;
    }

    public TeaMaker setAmountOfTea(int amountOfTea) {
        this.amountOfTea = amountOfTea;
        return this;
    }

    public TeaMaker setMilkPowder(String milkPowder) {
        this.milkPowder = milkPowder;
        return this;
    }

    public TeaMaker setAmountOfMilkPowder(int amountOfMilkPowder) {
        this.amountOfMilkPowder = amountOfMilkPowder;
        return this;
    }

    public TeaMaker setSugar(int sugar) {
        this.sugar = sugar;
        return this;
    }

    public Tea getTea(){
        return new Tea(tea,amountOfTea,milkPowder,amountOfMilkPowder,sugar);
    }
}
