package com.example.csgoskins;

public class Skin {

    String id, name, rarity, image;

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
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
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
                ", rarity='" + rarity + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
