package com.demo.plantes.metier;

public class Plante {

    private String nom;
    private String espece;
    private String couleur;
    private Integer age;

    public Plante(String nom, String espece, String couleur, Integer age) {
        this.nom = nom;
        this.espece = espece;
        this.couleur = couleur;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEspece() {
        return espece;
    }

    public void setEspece(String Espece) {
        this.espece = Espece;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
