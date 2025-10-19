public class MilkCoffee extends CoffeeDecorator {
    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }

    @Override
    public String getDiscription() {
        return super.getDiscription() + ", milk coffee";
    }
}
