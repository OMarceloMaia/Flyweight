import java.util.Map;
import java.util.HashMap;


public class ProductFactory {
    Map<String, ProductIntrinsic> products = new HashMap<String, ProductIntrinsic>();

    private String createId(ProductData data) {
        String temp = (data.getBrand() + "_" + data.getCategory()).toLowerCase();
        return temp;
    }

    public ProductFlyweight make(ProductData intrinsicState) {
        String key = this.createId(intrinsicState);
        
        if (products.containsKey(key)) 
            return products.get(key);

        products.put(key, new ProductIntrinsic(intrinsicState));
        return products.get(key);
    }

    public void getProducts() {
        for (String key : products.keySet()) {
            String category = products.get(key).intrinsicState.getCategory();
            String brand = products.get(key).intrinsicState.getBrand();
            System.out.printf("Marca: %s - ", brand);
            System.out.printf("Categoria: %s\n", category);
        }
    }
}
