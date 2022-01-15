
import java.util.Scanner;

public class Pisagor {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double x,y,hipo;
        System.out.println("x gir:");
        x= scn.nextDouble();
        System.out.println("y gir:");
        y=scn.nextDouble();
        x=x*x;
        y=y*y;
        hipo = Math.sqrt(y+x);
        System.out.println(hipo);
    }
    
}
