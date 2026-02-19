package edu.iesam.features.author.domain;

public class Author {
    private String id;
    private String name;
    private String bornDate;
    private String nacionality;

    public Author(String id, String name, String bornDate, String nacionality) {
        this.id = id;
        this.name = name;
        this.bornDate = bornDate;
        this.nacionality = nacionality;
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

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }
}
