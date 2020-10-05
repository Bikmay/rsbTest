package com.ivliev.weather;

public class FormData {


    public FormData() {

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String city;

    @Override
    public String toString() {
        return "FormData{" +
                "city='" + city + '\'' +
                '}';
    }
}
