package com.company;

public class Film {
    private String title;
    private String creationDate;
    private int duration;
    private int classification;
    private String country;
    private String description;
    private Category category;
    private int stock;

    public Film(String title, String creationDate, int duration, int classification, String country, String description, Category category, int stock) {
        this.title = title;
        this.creationDate = creationDate;
        this.duration = duration;
        this.classification = classification;
        this.country = country;
        this.description = description;
        this.category = category;
        this.stock = stock;
    }

    public Film() {
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", duration=" + duration +
                ", classification=" + classification +
                ", country='" + country + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                '}';
    }
}
