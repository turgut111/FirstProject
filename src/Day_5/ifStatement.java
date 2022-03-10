package Day_5;

public class ifStatement<yas> {
    public static void main(String[] args) {

        int yas=18;
        if (yas>=18){
            System.out.println(" Kişi Yetişkindir");

        }else {
            System.out.println("Yetişkin değildir");

        }
        // yaşı 70'den büyük  18'den küçük olma durumu

       // if (yas<=18){
         //   System.out.println(" Sosyal yardım alabilir");
if (yas<=18|yas>=70){
    System.out.println("Sosyal yardım alabilir");
}else {
    System.out.println("sosyal yardım alamaz");

}
    }


}



