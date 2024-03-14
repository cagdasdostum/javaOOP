public class ProductManager {
    public void add(Product product) {  //object referer
        //JDBC
        System.out.println("Product added to database.");
        product.setId("BeatsSoloWireless1");
        System.out.println("product's id: " + product.getId());
    }
    public void remove(Product product) {
        System.out.println("Product removed from database.");
    }
    public void add2(Product product2) {  //object referer
        //JDBC
        System.out.println("Product added to database.");
        product2.setId("BeatsSoloWireless1");
        System.out.println("product's id: " + product2.getId());
    }


}
