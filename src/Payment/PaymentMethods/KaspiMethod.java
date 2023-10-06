package Payment.PaymentMethods;


public class KaspiMethod implements Payment.Payment {
    private String phoneNumber;

    public KaspiMethod(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " with Kaspi: " + phoneNumber);
    }
}
