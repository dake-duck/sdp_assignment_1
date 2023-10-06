import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : items) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }

    public void checkout(Payment.Payment payment) {
        double total = calculateTotal();
        payment.processPayment(total);
        items.clear();
    }

    public void viewCart() {
        System.out.println("Shopping Cart Contents:");
        for (Product product : items) {
            System.out.println(product.getName() + " - $" + product.getPrice() + " x " + product.getQuantity());
        }
        System.out.println("Total: $" + calculateTotal());
    }
}
