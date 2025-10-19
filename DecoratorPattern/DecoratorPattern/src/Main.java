//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDiscription() + ", " + coffee.getCost());

        coffee = new MilkCoffee(coffee);
        System.out.println(coffee.getDiscription() + ", " + coffee.getCost());

        coffee = new SugarCoffee(coffee);
        System.out.println(coffee.getDiscription() + ", " + coffee.getCost());
    }
}