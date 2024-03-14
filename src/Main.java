// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Product product = new Product("Beats", "Solo", 200, "Black");
        System.out.println("Product's brand:" + product.brand + " Product's model:" + product.model + " Product's stock amount:" + product.stockAmount + " Product's color:" + product.color);
        ProductManager productManager = new ProductManager();
        productManager.add(product);

        Product product2 = new Product("Huawei", "MateBuds", 500, "Grey");
        System.out.println("Product's brand:" + product2.brand + " Product's model:" + product2.model + " Product's stock amount:" + product2.stockAmount + " Product's color:" + product2.color);
        ProductManager productManager2 = new ProductManager();
        productManager2.add2(product2);
    }
}