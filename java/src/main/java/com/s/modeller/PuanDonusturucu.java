package com.s.modeller;

public class PuanDonusturucu {
    public static Integer donusturIntToInteger(int sayi) {
        return sayi; // Autoboxing (int → Integer)
    }

    public static int donusturIntegerToInt(Integer sayi) {
        return sayi; // Unboxing (Integer → int)
    }
}
