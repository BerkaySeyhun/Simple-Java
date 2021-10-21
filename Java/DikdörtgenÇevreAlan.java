
import java.util.Scanner;

public class DikdörtgenÇevreAlan
{  
    public static void main(String[] args)
    {
        System.out.println("Dikdörgtenin bir kenarını gir: ");
        int a,b;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        System.out.println("Dikdörtgenin diğer kenarını gir: ");
        b=scan.nextInt();
        
        System.out.println("Dikdörtgenin çevresi:" + 2*(a+b));
        System.out.println("Dikdörtgenin alanı:" + a*b);
    }
    
}
