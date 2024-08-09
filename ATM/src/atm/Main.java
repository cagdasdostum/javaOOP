package atm;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------");
        System.out.println("HOŞGELDİNİZ!");
        System.out.println("------------");

        Giris giris = new Giris();
        giris.Login();

        AnaIslemler anaIslemler = new AnaIslemler();
        anaIslemler.calistir();

    }
}
