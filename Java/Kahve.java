
import java.util.Scanner;

public class Kahve {
 public static void main(String[] args) throws InterruptedException {
String kahve_cesitleri=
          "1-)Dibek Kahvesi\n"
        + "2-)Menengiç Kahvesi\n"
        + "3-)Çörekotu Kahvesi\n"
        + "4-)Adana Gar Kahvesi\n"
        + "5-)Sütlü Türk Kahvesi";
     System.out.println(kahve_cesitleri);
     System.out.println("Kaç numaralı kahveyi almak istersiniz ?");
Scanner scanner=new Scanner(System.in);
int kahve_secimi=scanner.nextInt();
String seker=
          "a-)Şekersiz\n"
        + "b-)Az Şekerli\n"
        + "c-)Orta Şekerli\n"
        + "d-)Şekerli";
     System.out.println(seker);
     System.out.println("Kahveniz şeker durumunu seçiniz");
     scanner.nextLine();
String seker_sayisi=scanner.nextLine();
    String secim="";
        if(seker_sayisi.equals("a")){
    secim="Şekersiz";
    }
        else if(seker_sayisi.equals("b")){
    secim="Az şekerli";
    }
        else if(seker_sayisi.equals("c")){
    secim="Orta şekerli";
    
            
    }
       else if(seker_sayisi.equals("d")){
    secim="Şekerli";
       
        }
                
       else {
            System.out.println("Şeker seçiminiz hatalı yaptınız");
     
       }
    switch(kahve_secimi){
        case 1:
            System.out.println("Kahveniz hazırlanıyor");
    Thread.sleep(2000);
        String bildirim=secim+" dibek kahveniz hazır\nAfiyet olsun";
            System.out.println(bildirim);
            break;

        case 2:
            System.out.println("Kahveniz hazırlanıyor");
    Thread.sleep(2000);
        String bildirim2=secim+" menengiç kahveniz hazır\nAfiyet olsun";
            System.out.println(bildirim2);
            break;
        case 3:
            System.out.println("Kahveniz hazırlanıyor");
    Thread.sleep(2000);
        String bildirim3=secim+" çörekotu kahveniz hazır\nAfiyet olsun";
            System.out.println(bildirim3);
            break;
        case 4:
            System.out.println("Kahveniz hazırlanıyor");
    Thread.sleep(2000);
        String bildirim4=secim+" Adana gar kahveniz hazır\nAfiyet olsun";
            System.out.println(bildirim4);
            break;
        case 5:
            System.out.println("Kahveniz hazırlanıyor");
    Thread.sleep(2000);
        String bildirim5=secim+" sütlü Türk kahveniz hazır\nAfiyet olsun";
            System.out.println(bildirim5);
            break;
        default:
            System.out.println("Kahve seçimini hatalı yaptınız");
            
            
    }  
        


}

}
