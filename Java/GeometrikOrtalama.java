
package pkg12.geometrikortalama;

import java.util.Scanner;


public class GeometrikOrtalama {

    public static void main(String[] args) {
        double a,b=1,c=0;
        Scanner scn = new Scanner(System.in);
        do{
            System.out.println("Sayı giriniz, Çıkmak için 0 a basınız");
            a = scn.nextInt();
            if(a != 0){
                b *= a;
                c++;
            }
        }while(a!=0);
        b = Math.pow(b, 1/c);
        System.out.println("Geometrik Ortalama :" + b);
    }
    
}
