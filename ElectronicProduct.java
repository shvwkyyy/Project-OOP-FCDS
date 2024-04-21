public class ElectronicProduct extends Product{
    String brand;
    int warrantyPeriod;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }
    public String getBrand() {
        return brand;
    }
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
}
