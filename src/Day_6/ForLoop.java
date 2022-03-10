package Day_6;

public class ForLoop {
    public static void main(String[] args) {


        for (int i=0; i<5; i++){

            System.out.println("Ardahan");
        }

        int toplam=0;
        for (int i=1; i<=10; i++){
            toplam=toplam+i;
        }
        System.out.println(toplam);
// 1den 100'e kadar olan çift sayıların toplamı

        int sum=0;
        for (int i=0; i<=100; i++){
            sum=sum*i;
        }
        System.out.println(sum);
    }
}
