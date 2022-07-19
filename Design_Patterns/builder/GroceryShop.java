package builder;

public class GroceryShop {
    public static void main(String args[]) {
        Tea t = new TeaMaker().setTea("Ceylonta").setAmountOfTea(50).setAmountOfMilkPowder(400).setSugar(250).getTea();
        System.out.println(t);
    }
}

