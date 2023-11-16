package models;

public class Person {
    private String document;
    private String name;

    public Person(String document, String name) {
        this.document = document;
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
