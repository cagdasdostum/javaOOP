package atm;

import java.util.Scanner;

public class Giris {
    public void Login() {
        Scanner sc = new Scanner(System.in);
        int remainingTry = 3;
        do {
            System.out.println("Enter your password: ");
            String password = sc.nextLine();

            if (!(password.equals("admin"))) {
                System.out.println("Wrong password");
                remainingTry--;
            }
            else {break;}
            if(remainingTry == 0) {
                System.out.println("Yanlış yapma hakkınız bitti. Giriş yapamazsınız!");
            }
        } while(remainingTry > 0);
    }
}
