public class Customer {
    public Customer() {
    }
int customerId;
    String name,address;
    public Customer(int customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getCustomerId() {
        return customerId;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
}
