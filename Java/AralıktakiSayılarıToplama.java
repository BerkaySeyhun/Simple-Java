

import java.util.Scanner;


public class AralıktakiSayılarıToplama {

    public static void main(String[] args) {
        double a, b, c, d = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Başlangıç giriniz");
        a = scn.nextInt();
        System.out.println("Bitiş giriniz");
        b = scn.nextInt();
        System.out.println("Adım Miktarı giriniz");
        c = scn.nextInt();
        
        for(double i = a; i<=b ;  i+= c ){
            d +=i;
        }
        System.out.println("Toplam :"+ d);
    }

}
