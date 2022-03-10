package Day_7;

import java.util.Scanner;

public class CesitliOrnekler {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("İsminizi Giriniz:");
       String ad= sc.nextLine();
        System.out.println("Merhaba"+ad);
       System.out.println("soyisminizi giriniz");
       String Soyisim=sc.nextLine();

        System.out.println("Doğum Tarihinizi giriniz:");
        int dtarihi=sc.nextInt();

    }
}
