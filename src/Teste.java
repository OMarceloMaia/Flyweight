public class Teste {
    public static void main(String[] args) throws Exception {
        ProductFactory factory = new ProductFactory();
        ProductContext context = new ProductContext();
        context.productContext(factory, "Tenis", "500", "Adidas", "Basic");
        context.productContext(factory, "Camisa", "200", "Puma", "Premium");
        context.productContext(factory, "Tenis", "500", "Adidas", "Premium");
        context.productContext(factory, "Camisa", "200", "Puma", "Premium");
        context.productContext(factory, "Tenis", "500", "Adidas", "Premium");
        context.productContext(factory, "Camisa", "200", "Puma", "Premium");
        context.productContext(factory, "Tenis", "500", "Adidas", "Premium");
        context.productContext(factory, "Camisa", "200", "Puma", "Premium");
        context.productContext(factory, "Tenis", "500", "Adidas", "Premium");
        context.productContext(factory, "Camisa", "200", "Puma", "Premium");
        context.productContext(factory, "Tenis", "500", "Adidas", "Premium");
        context.productContext(factory, "Camisa", "200", "Puma", "Premium");
        context.productContext(factory, "Tenis", "500", "Adidas", "Premium");
        context.productContext(factory, "Camisa", "200", "Puma", "Premium");
        context.productContext(factory, "Tenis", "500", "Adidas", "Premium");
        context.productContext(factory, "Camisa", "200", "Puma", "Premium");
        context.productContext(factory, "Tenis", "500", "Adidas", "Basic");
        context.productContext(factory, "Camisa", "200", "Puma", "Premium");

        System.out.println("\nObjetos compartilhados:");
        factory.getProducts();
    }
}
