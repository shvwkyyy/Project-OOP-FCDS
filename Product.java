public class Product {
   int productId;
     String name;
     double price;
    public void setProductId(int productId) {
        this.productId = Math.abs(productId);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = Math.abs(price);
    }

    public int getProductId() {
        return productId;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

}
