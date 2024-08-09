package atm;

import java.util.Scanner;

public class CekYatir extends AnaIslemler{

    public int ParaYatir() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount you want to deposit: ");
        int amount = sc.nextInt();
        bakiye = amount + getBakiye();
        return bakiye;
    }
    public int ParaCek() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount you want to deposit: ");
        int amount = sc.nextInt();
        bakiye = getBakiye() - amount;
        if (bakiye < 0) {
            System.out.println("Elinizdeki miktardan fazla para çekemezsiniz!");
        }
        return bakiye;
    }
    public void showBalance() {
        System.out.println("Güncel bakiyeniz: " + bakiye);
    }


}
