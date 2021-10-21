
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class PlakaTahmin {
    public static void main(String[] args) throws InterruptedException {
   Scanner scanner=new Scanner(System.in);
        HashMap<Integer,String>hMap=new HashMap<Integer,String>();
    hMap.put(1,"Adana");       
    hMap.put(2,"Adiyaman");
    hMap.put(3,"Afyonkarahisar");
    hMap.put(4,"Agri");       
    hMap.put(5,"Amasya");
    hMap.put(6,"Ankara");
    hMap.put(7,"Antalya");       
    hMap.put(8,"Artvin");
    hMap.put(9,"Aydin");
    hMap.put(10,"Balikesir");       
    hMap.put(11,"Bilecik");
    hMap.put(12,"Bingol");
    hMap.put(13,"Bitlis");       
    hMap.put(14,"Bolu");
    hMap.put(15,"Burdur");
    hMap.put(16,"Bursa");
    hMap.put(17,"Çanakkale");
    hMap.put(18,"Çankiri");
    hMap.put(19,"Çorum");       
    hMap.put(20,"Denizli");
    hMap.put(21,"Diyarbakır");
    hMap.put(22,"Edirne");       
    hMap.put(23,"Elazığ");
    hMap.put(24,"Erzincan");
    hMap.put(25,"Erzurum");       
    hMap.put(26,"Eskisehir");
    hMap.put(27,"Gaziantep");
    hMap.put(28,"Giresun");       
    hMap.put(29,"Gumushane");
    hMap.put(30,"Hakkari");
    hMap.put(31,"Hatay"); 
    hMap.put(32,"Isparta");
    hMap.put(33,"Mersin");
    hMap.put(34,"İstanbul");
    hMap.put(35,"İzmir");
    hMap.put(36,"Kars");
    hMap.put(37,"Kastamonu");
    hMap.put(38,"Kayseri");
    hMap.put(39,"Kirkareli");
    hMap.put(40,"Kirsehir");
        int hak=3;
String message="Şehir Tahmin Oyununa Hoşgeldiniz\n"
        + "Oyunumuzda toplam 3 tahmin hakkınız bulunmaktadır.\n"
        + "Plaka kodları 1'den 40'a kadardır.\n"
        + "Oyun başladı.Başarılar..." ;
while(true){
        System.out.println("");
    System.out.println(message);     
Random random=new Random();
    int plaka=1+random.nextInt(39);
        for(int i=hak;i>0;i--){
            System.out.println(plaka+" hangi şehrimizin plakasıdır ?");
    String sehir_tahmin=scanner.nextLine();
        if(sehir_tahmin.equals(hMap.get(plaka))){
    String message2="Tebrikler şehri doğru tahmin ettiniz\n"
            + "Tekrar oynamak için 1'e çıkmak için 0'a basınız";
            System.out.println(message2);
            int cevap=scanner.nextInt();
                if(cevap==0){
                    System.out.println("Çıkış yapılıyor...");
                    Thread.sleep(3000);
                    return;
                }
                else {
                    break;
                }
        }
        else if(!sehir_tahmin.equals(hMap.get(plaka))){
    String message3="Hatalı bir tahmin yaptınız\n"
            + "Kalan tahmin hakkı="+(i-1);        
            System.out.println(message3);
                if(i==1){
    String message4="Tahmin hakkınız bitti\n"
            + "Tekrar oynamak için 1'e çıkmak için 0'a basınız";
                    System.out.println(message4);
            int cevap=scanner.nextInt();
                if(cevap==0){
                   System.out.println("Çıkış yapılıyor...");
                    Thread.sleep(3000);
                    return;
                }
                else{
                    break;
                }
                }
        }
        }
}

}
}
