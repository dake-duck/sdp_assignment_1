package Payment.PaymentMethods;


public class CreditCardMethod implements Payment.Payment {
    private String cardNumber;
    private String name;

    public CreditCardMethod(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " with Credit Card: " + cardNumber + " (Name: " + name + ")");
    }
}
