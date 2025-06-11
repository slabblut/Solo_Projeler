package com.s.modeller;
import java.util.HashSet;


public class MeyveListesi {
    public static HashSet<String> getMeyveler() {
        HashSet<String> meyveler = new HashSet<>();
        meyveler.add("çilek");
        meyveler.add("kivi");
        meyveler.add("kiraz");
        meyveler.add("karpuz");
        return meyveler;
        // HashSet: Tekrar eden (duplicate) elemanları otomatik olarak engeller.
        // Sıra (index) içermez, elemanlar eklenme sırasına göre saklanmaz.
        // add() ile eleman eklenir, contains() ile var mı kontrol edilir, remove() ile silinir.

    }
}
