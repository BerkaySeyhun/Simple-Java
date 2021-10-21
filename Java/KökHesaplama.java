package pkg11.kökhesaplama;

import java.util.Scanner;

public class KökHesaplama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Denklem Katsayısını gir: ");
        int a = scan.nextInt();
        System.out.println("2.Denklem Katsayısını gir: ");
        int b = scan.nextInt();
        System.out.println("3.Denklem Katsayısını gir: ");
        int c = scan.nextInt();

        double d = (b * b) - (4 * a * c);
        System.out.println(d);

        if (d > 0) {
            double e = (-b + Math.sqrt(d)) / (2 * a);
            double f = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("1.Kök :" + e + "2.Kök :" + f);
        } else if (d == 0) {
            double e = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Kök :" + e);
        } else {
            System.out.println("Kök yok");
        }
    }

}
