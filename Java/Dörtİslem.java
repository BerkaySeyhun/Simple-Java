
import java.util.Scanner;


public class Dörtİslem {

    
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int a,b,c,d,e,f;
        System.out.println("İki tane sayi gir");
        a=scan.nextInt();
        b=scan.nextInt();
        
        
        c=a+b;
        d=a-b;
        e=a*b;
        f=a/b;
        
       
        System.out.println("Toplama :"+ c );
        System.out.println("Çıkarma :"+ d);
        System.out.println("Çarpma :"+ e );
        System.out.println("Bölme :"+ f);      
    }
    
}
