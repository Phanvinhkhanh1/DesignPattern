public class CreditcardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditcardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid by using credit card " + cardNumber);
    }
}
