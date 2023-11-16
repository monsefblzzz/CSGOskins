package com.example.csgoskins;

import com.google.gson.annotations.SerializedName;

public class Rarity {

    @SerializedName("name")
    private String name;

    public Rarity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rarity{" +
                "name='" + name + '\'' +
                '}';
    }
}
