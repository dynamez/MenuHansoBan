package com.example.dynam.menuhansoban;

import android.widget.ImageView;

/**
 * Created by Tsunderella on 14-12-2015.
 */
public class MenuTemple {

    private int id;
    private String name, korean;
    private String description;
    private String description2;
    String picante;
    private Double price;
    private String category, koreancat;
    private ImageView foto;
    private String foto2;

    public MenuTemple(){}

    public MenuTemple(String name, String korean, String description, String description2, Double price, String category, String picante, ImageView foto) {
        super();
        this.name = name;
        this.korean = korean;
        this.description = description;
        this.description2 = description2;
        this.price = price;
        this.category = category;
        this.picante = picante;
        this.foto = foto;
    }

    //getters & setters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String getDescription2(){
        return description2;
    }
    public Double getPrice(){
        return price;
    }
    public String getCategory(){
        return category;
    }
    public ImageView getFoto(){
        return foto;
    }
    public String getFoto2(){
        return foto2;
    }
    public String getKorean(){return korean;}
    public String getPicante(){ return picante;}

    public String getKoreancat() {
        return koreancat;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setDescription2(String description2){
        this.description2=description2;
    }
    public void setPrice(Double price){
        this.price=price;
    }
    public void setFoto(ImageView foto){
        this.foto=foto;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setFoto2(String foto2){
        this.foto2=foto2;
    }
    public void setKorean(String korean){this.korean=korean; }
    public void setPicante(String picante){this.picante=picante;}

    public void setKoreancat(String koreancat) {
        this.koreancat = koreancat;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", description=" + description + ", description2" + description2 + ",price" + price + ",category" + category + ",foto" + foto2
                + "]";
    }
}