package Day_7;

import java.util.Scanner;

public class Ornek_2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        int sayi=sc.nextInt();

        if (sayi%2==0){
            System.out.println("Sayı çift Sayıdır");
        }else {
            System.out.println("sayı tektir");
        }
    }
}
