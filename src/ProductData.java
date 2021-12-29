public class ProductData {
    private String brand;
    private String category;
    
    public ProductData(String brand, String category) {
        this.category = category;
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }
    public String getBrand() {
        return brand;
    }
}