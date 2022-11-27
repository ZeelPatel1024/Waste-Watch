package com.example.technomypart;

public class Items {
    private String name;
    private String avgExpTime;
    private String brand;
    private String link;
    private int img;

    public Items(String name, String avgExpTime, String brand, String link,int img) {
        this.name = name;
        this.avgExpTime = avgExpTime;
        this.brand = brand;
        this.link = link;
        this.img = img;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getAvgExpTime() {
        return avgExpTime;
    }

    public void setAvgExpTime(String avgExpTime) {
        this.avgExpTime = avgExpTime;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
