package com.s.uygulama;
/*import com.s.modeller.Gun;

public class Main {
    public static void main(String[] args) {
        Gun bugun = Gun.SALI;
        System.out.println("Bugün günlerden: " + bugun);
    }
}*/


/*import java.util.List;
import com.s.modeller.SehirListesİ;

public class Main {
    public static void main(String[] args) {
        // Şehirleri al
        List<String> sehirler = SehirListesİ.getSehirler();

        // Şehirleri yazdır
        for (String sehir : sehirler) {
            System.out.println(sehir);

            // ArrayList, sıralı ve tekrar edebilen verileri dinamik olarak saklar.
            // ArrayList: add() ekler, get() eleman alır, size() sayar, remove() siler, contains() var mı diye bakar, clear() hepsini temizler.
            // Listeyi for-each ile dolaşır
        }
    }
}*/


/*import java.util.HashSet;
import com.s.modeller.MeyveListesi;

public class Main {
    public static void main(String[] args) {
        HashSet<String> meyveler = MeyveListesi.getMeyveler();

        for (String meyve : meyveler) {
            System.out.println(meyve);
            // HashSet: Tekrar eden (duplicate) elemanları otomatik olarak engeller.
            // Sıra (index) içermez, elemanlar eklenme sırasına göre saklanmaz.
            // add() ile eleman eklenir, contains() ile var mı kontrol edilir, remove() ile silinir.

        }
    }
}*/

/*import java.util.HashMap;
import java.util.Map;
import com.s.modeller.OgrenciNotlari;


public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> notlar = OgrenciNotlari.getNotlar();

        // Her bir anahtar-değer çifti için yazdırma
        for (Map.Entry<String, Integer> entry : notlar.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

            // HashMap: Anahtar-değer (key-value) yapısıyla veri tutar.
            // put() ile veri eklenir, get() ile anahtara göre değer alınır.
            // entrySet() ile tüm çiftler for-each döngüsüyle dolaşılabilir.


        }
    }
}*/


/*
import java.util.Scanner;
import com.s.modeller.BolmeIslemi;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean devam = true;

        System.out.println(" Bölme İşlemi Uygulamasına Hoş Geldiniz");

        while (devam) {
            try {
                System.out.print(" Birinci sayıyı girin: ");
                int sayi1 = scanner.nextInt();

                System.out.print(" İkinci sayıyı girin: ");
                int sayi2 = scanner.nextInt();

                double sonuc = BolmeIslemi.bol(sayi1, sayi2);
                System.out.println(" Sonuç: " + sonuc);
                devam = false;

            } catch (ArithmeticException e) {
                System.out.println(" Hata: Sıfıra bölme yapılamaz. Lütfen tekrar deneyin.");
            }
        }

        System.out.println(" İşlem tamamlandı. İyi günler!");
        scanner.close();

        // try-catch, çalışma zamanında oluşabilecek hataları (exception) yakalayarak programın çökmesini önler.
        // try bloğunda hata oluşabilecek kodlar yazılır; catch bloğu hatayı yakalar ve nasıl tepki verileceğini tanımlar.

    }
}
*/

/*
import java.util.List;
import com.s.modeller.SayiListesi;

public class Main {
    public static void main(String[] args) {
        List<Integer> sayilar = SayiListesi.getSayilar();


        sayilar.forEach(sayi -> System.out.println(sayi));

        // Lambda ifadeleri, forEach ile birlikte kullanılarak listedeki her eleman üzerinde kısa ve okunabilir işlemler yapılmasını sağlar.

    }
}
*/


import com.s.modeller.PuanDonusturucu;

public class Main {
    public static void main(String[] args) {
        int hamPuan = 95;

        // Autoboxing
        Integer kayitliPuan = PuanDonusturucu.donusturIntToInteger(hamPuan);
        System.out.println("Autoboxing → int'ten Integer'a: " + kayitliPuan);

        // Unboxing
        int finalPuan = PuanDonusturucu.donusturIntegerToInt(kayitliPuan);
        System.out.println("Unboxing → Integer'dan int'e: " + finalPuan);

        // Autoboxing: Primitive bir değer (örneğin int), otomatik olarak wrapper nesnesine (Integer) dönüştürülür.
        // Unboxing: Wrapper sınıfındaki nesne (örneğin Integer), otomatik olarak primitive tipe (int) geri çevrilir.
        // Wrapper sınıflar, primitive verileri nesne gibi kullanmamıza ve koleksiyonlarda saklamamıza olanak tanır.

    }
}















