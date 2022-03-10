package Day_7;

import java.util.Scanner;

public class KareninAlanı {
    public static void main(String[] args) {
        //Karenin kenarını ekrandan alıp alanını hesaplayınız

        Scanner sc=new Scanner(System.in);
        System.out.println("Karenin bir kenarı= ");
        int kenar=sc.nextInt();
        System.out.println("Menu");
        System.out.println("1.Alan Hesapla");
        System.out.println("2.Çevre Hesapla");
        System.out.println("Seçiniz= ");
        int secim=sc.nextInt();
        switch (secim){

            case 1:
                int alan= kenar*kenar;
                System.out.println("Alan= "+alan);break;
            case 2:
                int cevre=4*kenar;
                System.out.println("Çevre ="+cevre);
                break;
            default:
                System.out.println("Yanlış Seçim yaptınız");
        }


    }
}
