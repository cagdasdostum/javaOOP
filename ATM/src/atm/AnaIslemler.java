package atm;

import java.util.Scanner;
public class AnaIslemler {
    protected int bakiye = 40000;
    public int getBakiye(){
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void calistir() {
        Scanner sc = new Scanner(System.in);
        CekYatir cekYatir = new CekYatir();

        System.out.println("Para Yatırma işlemi için '1' \nPara Çekme işlemi için '2'");

        int selection = sc.nextInt();
        switch (selection) {
            case 1:
                cekYatir.ParaYatir();
                cekYatir.showBalance();
                break;
            case 2:
                cekYatir.ParaCek();
                cekYatir.showBalance();
                break;
        }
        
    }

}
