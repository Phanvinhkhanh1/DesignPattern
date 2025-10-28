//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.setPaymentStrategy(new CreditcardPayment("123456789"));
        shoppingCart.checkout(123);

        shoppingCart.setPaymentStrategy(new PayPalPayment("Khanh161297@gmail.com"));
        shoppingCart.checkout(500);
    }
}