
import java.util.Scanner;


public class HarmonikOrtalama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b = 0, c = 0;
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("Sayı giriniz, Çıkmak için 0 a basınız");
            a = scn.nextInt();
            if (a != 0) {
                b += (1/a);
                c++;
            }
        } while (a != 0);
        b = c/b;
        System.out.println("Harmonik Ortalaması :" + b );
    }

}
