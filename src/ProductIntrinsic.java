public class ProductIntrinsic implements ProductFlyweight {
    ProductData intrinsicState;

    public ProductIntrinsic(ProductData intrinsicState) {
    this.intrinsicState = intrinsicState;
    }

    @Override
    public void productInfo(String name, String qtd) {
        System.out.printf("\nNome do Produto: %s\n", name);
        System.out.printf("Quatidade em Estoque: %s\n", qtd);
        System.out.printf("Marca: %s\n", intrinsicState.getBrand());
        System.out.printf("Categoria: %s\n\n", intrinsicState.getCategory());
    }
}