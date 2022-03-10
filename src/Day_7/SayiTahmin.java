package Day_7;

import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int sayi= (int) Math.round(Math.random()*10);
        System.out.println("Bir sayı tahmin ediniz (3 hakkınız var)");
        int tahmin;
        for (int i = 0; i <6 ; i++) {
            System.out.print((i+1)+".tahmininiz= ");
            tahmin=sc.nextInt();

            if (sayi==tahmin){
                System.out.println("Tebrikler bildiniz");
                break;
            }

        }

    }
}
