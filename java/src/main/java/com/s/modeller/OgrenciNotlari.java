package com.s.modeller;
import java.util.HashMap;


public class OgrenciNotlari {
    public static HashMap<String, Integer> getNotlar() {
        HashMap<String, Integer> notlar = new HashMap<>();
        notlar.put("Sıla", 80);
        notlar.put("Hümeyra",85 );
        notlar.put("Bekir", 75);
        return notlar;

        // HashMap: Anahtar-değer (key-value) yapısıyla veri tutar.
        // put() ile veri eklenir, get() ile anahtara göre değer alınır.
        // entrySet() ile tüm çiftler for-each döngüsüyle dolaşılabilir.
    }
}
