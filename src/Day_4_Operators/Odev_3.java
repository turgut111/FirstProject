package Day_4_Operators;

public class Odev_3 {
    public static void main(String[] args) {

        /*
        Write a Java program that displays the area and perimeter of a circle that has a radius of
        5.5 using the following formulas:
        perimeter = 2 * radius * 𝜋
        area = radius * radius * 𝜋
         */

        double radius=5.5;
        double pi=Math.PI;
        double perimeter= 2*radius*pi;
        double area= radius*radius*pi;

        System.out.println("Dairenin Çevresi= "+perimeter);
        System.out.println("Dairenin Alanı= "+area);

    }
}
