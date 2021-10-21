
import java.util.Scanner;


public class Karşılaştırma {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x, y;
        System.out.println("x gir:");
        x = scn.nextDouble();
        System.out.println("y gir:");
        y = scn.nextDouble();
        
        if(x>y){
            System.out.println("x büyüktür y den");
        }else{
            System.out.println("y büyüktür x den");
        }

    }

}
