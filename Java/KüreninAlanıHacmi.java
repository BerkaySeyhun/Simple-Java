
import java.util.Scanner;

public class KüreninAlanıHacmi
{
    public static void main(String[] args)
    {
        System.out.println("Kürenin yarıçapını gir:");
        Scanner scan= new Scanner(System.in);
        int r;
        r=scan.nextInt();
        System.out.println("Kürenin alanı : "+ 4*3*r*r );
        System.out.println("Kürenin hacmi : "+ (4*3*r*r*r)/3 );     
    } 
}
