
import java.util.Scanner;

public class TabanYükseklikÜçgenAlan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x, y, hipo;
        System.out.println("x gir:");
        x = scn.nextDouble();
        System.out.println("y gir:");
        y = scn.nextDouble();
        hipo = (x*y)/2;
        System.out.println("Üçgenin Alanı :"+ hipo);
    }

}
