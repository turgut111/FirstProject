package Day_7;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {

        //4.) Su an ki yili ve dogum tarihinizi ekrandan
        // alip yasinizi hesaplayin.

        Scanner sc=new Scanner(System.in);

        System.out.println(" içinde bulunduğumuz Yılı yazınız");

        int mevcutyıl=sc.nextInt();

        System.out.println("Doğum tarihinizi  Giriniz");

        int dTarihi=sc.nextInt();

        int yasınız= mevcutyıl-dTarihi;
        System.out.println("Yaşınız="+ yasınız);

    }



}
