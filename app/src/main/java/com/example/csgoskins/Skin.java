package com.example.csgoskins;

import com.google.gson.annotations.SerializedName;

public class Skin {

    @SerializedName("id")
    private String id;

    private String name;

    @SerializedName("rarity")
    private String Rarity;

    @SerializedName("image")
    private String image;

    @SerializedName("statTrak")
    private boolean hasStatTrak;

    public Skin() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRarity() {
        return Rarity;
    }

    public void setRarity(String rarity) {
        this.Rarity = rarity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Skin{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rarity='" + Rarity + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
