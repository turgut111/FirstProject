package Day_7;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Birinci Sayıyı Giriniz= ");
        int sayi1=sc.nextInt();
        System.out.println("İkinci Sayıyı giriniz= ");
        int sayi2=sc.nextInt();
        if (sayi1>sayi2){
            System.out.println("Birinci Sayı Büyüktür");
        }else if (sayi2>sayi1){
            System.out.println("İkinci Sayı Büyüktür");
        }else {
            System.out.println("iki sayı birbirine eşittir");
        }
    }
}
