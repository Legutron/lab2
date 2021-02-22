package com.example.przepisy.entity;

public class Recipe {
    String nazwa;
    String opis;
    Boolean czyWeganski;

    public Recipe(String nazwa, String opis, Boolean czyWeganski){
        this.nazwa = nazwa;
        this.opis = opis;
        this.czyWeganski = czyWeganski;
    }

    public String getName(){return nazwa;};
    public String getDescription(){return opis;};

    public Boolean isVegan() {
        return czyWeganski;
    }
}
