package com.s.oop;

public class Student {
    private String isim;
    private String email;

    public Student(String isim, String email) {
        this.isim= isim;
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

}
