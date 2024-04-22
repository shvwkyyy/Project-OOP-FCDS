import javax.swing.*;
public class Order {
    int customerId;
    int orderId;
    Product[] products;
    double totalPrice;
    String orderDetails;
    public void setProducts(Product[] products) {
        this.products = products;
    }
    public Order(int customerId, int orderId, double totalPrice) {
        this.orderId = Math.abs(orderId);
        this.customerId = Math.abs(customerId);
        this.totalPrice = Math.abs(totalPrice);
    }
    public void OrderInfo() {
        String message = "Here's your order summary:\n"+            "Order ID: " + orderId + "\n" +
                "Customer ID: " + customerId + "\n" +            "Products:\n";
        for (int i = 0; i < products.length; i++) {
            message += products[i].getName() + " - $" + products[i].getPrice() + "\n";
        }
        message += "\nTotal Price: $" + totalPrice;
        JOptionPane.showMessageDialog(null, message);
        }
public Order placeOrder(){
System.out.println("Your order has placed successfully!");
return new Order(int customerId, int orderId, double totalPrice);   
}
}




