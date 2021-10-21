
import java.util.Scanner;


public class BölümdenKalanHesaplama {

    public static void main(String[] args) {
        double a, b, c = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Bölüneni giriniz");
        a = scn.nextInt();
        System.out.println("böleni giriniz");
        b = scn.nextInt();
        c = a % b;
        System.out.println("Kalan :"+ c);
    }

}
