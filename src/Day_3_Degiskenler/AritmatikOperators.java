package Day_3_Degiskenler;

public class AritmatikOperators {
    public static void main(String[] args) {

        /*
        Aritmatic Operators

        -çarpma =*    operand1 ve operand2 değerlerini çarpar
        -toplama=+    operand1 ve operand2 değerlerini toplar
        -çıkarma=- operand1 den operand2 değerlerini çıkarır
        -bölme= / operand1 i operand2 değerlerine böler
       - mod alma= %  operand1 in operand2 ye bölümünden kalanı verir
         */
        // sağdaki ve soldaki değişkenlere operand denir

        int sayı1=20;
        int sayı2=30;
        int toplam= sayı1+sayı2;

        System.out.println("Toplam= " + toplam);

        int fark= sayı2-sayı1;

        System.out.println("Fark= "+ fark);

        int result=sayı1*sayı2;

        System.out.println("Çarpma Sonucu="+ result);

       double sonuc=(double) sayı2/sayı1;

       // sayı 1 sayı2 İnt olduğu için yine sonuç sorunlu olur

        // sayı double dnüştüğünde diğeri otomatik dönüşür

        System.out.println("Bölme Sonucu="+ sonuc);

        int kalan= 7%2;
        System.out.println("Mod Alma Sonucu= "+ kalan);




    }
}
