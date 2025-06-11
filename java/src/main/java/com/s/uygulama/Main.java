package com.s.uygulama;
/*import com.s.modeller.Gun;

public class Main {
    public static void main(String[] args) {
        Gun bugun = Gun.SALI;
        System.out.println("Bugün günlerden: " + bugun);
    }
}*/

import java.util.List;
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
}




