public class SugarCoffee extends CoffeeDecorator {

    public SugarCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDiscription() {
        return super.getDiscription() + ", sugar coffee";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}