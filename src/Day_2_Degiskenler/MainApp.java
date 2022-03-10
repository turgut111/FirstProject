package Day_2_Degiskenler;

public class MainApp {
    public static void main(String[] args) {
     //Değişkenler

        /**
         * metodun ne işe yaradığını parametrelerin açıklmasını yazarız.
        /*

     /*

     1-Resmi Kurallar
           -Java anahtar kelimeleri kullanılamaz
           -Değişken isminde boşluk olmaz
           -Değişken isminde herhangi bir operatör olmaz
           - Değişken isminin ortasında ve sonunda  sayı bulunabilir
           -Değişken içinde alttan tire kullanılır
      2- Gayrı resmi kurallar

            -Değişken ismi içeriğe uygun olöalı
            -Notasyonlara uygun yazılmalıdır.
            - Türkçe karakter kullanılmaz: ı İ, ğ, Ğ, ç,Ç, ş, Ş

            Notasyonlar:

            camel notasyonu: değişken ve metod tanımlamalarında kullanılır

            Eğer tek kelime ise tameamen küçük
            -Eğer birden fazla kelime var ise ilk kelime küçük diğer kelimelerin baş harfi
            büyük
            -

            Paskal notasyonu: Sınıf isimlendirmelerinde kullanılır

            - Tek kelime ise sadece baş harf büyük, Birden fazla kelime ise her kelime
            baş harfi büyük


            Snake notasyonu:

           - Kelimeler arazında alttan tire bulunur


      */

        int kısaKenar=4, uzunKenar=8;

        kısaKenar=6;

        int alan= kısaKenar*uzunKenar;

        System.out.println("Dikdörtgenin alanı= "+ alan);

        byte maxValue= Byte.MAX_VALUE;
        byte minValue= Byte.MIN_VALUE;

        long deger=Long.MAX_VALUE;

        int minInt= Integer.MIN_VALUE;

        long deger2= 30000000000L;

    }
}
