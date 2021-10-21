package pkg3.kareninçevresivealanı;

import java.util.Scanner;


public class KareninÇevresiVeAlanı
{
    public static void main(String[] args) 
    {
        System.out.println("Karenin bir kenarının uzunluğunu gir: ");
        Scanner scan= new Scanner(System.in);
        int a;
        a=scan.nextInt();
        
        System.out.println("Karenin çevresi:"+ 4*a );
        System.out.println("Karenin alanı:"+ a*a); 
    }
}
