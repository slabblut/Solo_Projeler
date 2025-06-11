package com.s.modeller;

import java.util.ArrayList;
import java.util.List;


public class SehirListesİ {

    public static List<String> getSehirler() {
        List<String> sehirler = new ArrayList<>();
        sehirler.add("Adana");
        sehirler.add("Bursa");
        sehirler.add("Erzurum");
        return sehirler;
        // ArrayList, sıralı ve tekrar edebilen verileri dinamik olarak saklar.
        // ArrayList: add() ekler, get() eleman alır, size() sayar, remove() siler, contains() var mı diye bakar, clear() hepsini temizler.
        // Listeyi for-each ile dolaşır
    }
}
