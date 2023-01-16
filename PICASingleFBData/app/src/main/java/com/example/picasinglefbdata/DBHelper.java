package com.example.picasinglefbdata;

public class DBHelper {

    String name,city,phoneno;

    public DBHelper(String name, String city, String phoneno) {
        this.name = name;
        this.city = city;
        this.phoneno = phoneno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
}
