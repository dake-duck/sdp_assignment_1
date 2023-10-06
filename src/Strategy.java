import java.util.Scanner;

import Payment.Payment;
import Payment.PaymentMethods.CreditCardMethod;
import Payment.PaymentMethods.KaspiMethod;

public class Strategy {
    public static void main(String[] args) throws Exception {
        ShoppingCart cart = new ShoppingCart();

        Product product1 = new Product("Item 1", 25.0, 2);
        Product product2 = new Product("Item 2", 15.0, 3);

        cart.addProduct(product1);
        cart.addProduct(product2);

        cart.viewCart();

        Scanner scanner = new Scanner(System.in);
        Payment selectedPaymentMethod = null;

        while (selectedPaymentMethod == null) {
            System.out.println("Select a payment method:");
            System.out.println("1. Credit Card");
            System.out.println("2. Kaspi");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    selectedPaymentMethod = new CreditCardMethod("1234-5678-9012-3456", "John Doe");
                    break;
                case 2:
                    selectedPaymentMethod = new KaspiMethod("+7-777-777-77-77");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
            scanner.close();
        }

        cart.checkout(selectedPaymentMethod);
        
    }
}
