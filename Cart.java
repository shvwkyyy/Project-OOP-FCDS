public class Cart {
    int customerId;
    int nProducts;
     Product[] products;
    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setNProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
        this.products = new Product[this.nProducts];
    }
    public int getNProducts() {
        return nProducts;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
    public Product[] getProducts() {
        return products;
    }
    public void AddProduct(Product product,int index){
        if(index>=0 && index<products.length ){
            products[index] = product;
        }
        else{
            System.out.println("Invalid Index");
        }
    }
    public void removeProduct(int index) {
        if (index >= 0 && index < products.length) {
            products[index] = null;
        }
    }
    public double CalculatePrice(){
        double price = 0;
        for (Product product : products)
            if (product != null)
                price += product.getPrice();
        return price;
    }
    public void placeOrder() {
        System.out.println("Order placed successfully.");
    }
}
