
import java.util.Scanner;


public class SinusÜçgenAlan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x, y, alan, aci;
        System.out.println("x gir:");
        x = scn.nextDouble();
        System.out.println("y gir:");
        y = scn.nextDouble();
        System.out.println("aci gir:");
        aci = scn.nextDouble();

        alan = x * y * Math.sin(aci*Math.PI/180) / 2;
        System.out.println("Üçgenin :"+ alan);
    }

}
