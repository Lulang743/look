package com.example.heritage;

public class details {
    private String Tittle;
    private String description;

    public details(String tittle, String description) {
        this.Tittle = tittle;
        this.description = description;
    }

    public String getTittle() {
        return Tittle;
    }

    public String getDescription() {
        return description;
    }
}
