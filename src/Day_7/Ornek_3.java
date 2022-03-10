package Day_7;

import java.util.Scanner;

public class Ornek_3 {
    public static void main(String[] args) {

        // Dikdörtgenin kısa ve uzun kenarını ekrandan alınız ve çevresini bulunuz

        Scanner sc=new Scanner(System.in);
        System.out.println("Uzun Kenarı yazınız=");
        int uzunKenar=sc.nextInt();
        System.out.println("Kısa Kenarı Giriniz");
        int kısaKenar=sc.nextInt();
        int cevre= 2*(kısaKenar+uzunKenar);
        System.out.println("Dikdörtgenin Çevresi= "+ cevre);

        // Ekrandan isminizi ve soyisiminizi girin ilk harfin A olup olmadığını kontrol edin

        System.out.println("isim ve soyisminizi girin: ");

        String isimSoyisim=sc.nextLine();

        System.out.println(isimSoyisim.startsWith("A"));
    }

}
