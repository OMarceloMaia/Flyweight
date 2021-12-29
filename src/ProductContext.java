public class ProductContext {
    public void productContext(ProductFactory factory, String name, String qtd, String brand, String category) {
        ProductFlyweight prod = factory.make(new ProductData(brand, category));
        prod.productInfo(name, qtd);
    }
}
