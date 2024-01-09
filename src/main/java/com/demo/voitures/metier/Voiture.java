package com.demo.voitures.metier;


public class Voiture {
    private String nom;
    private String marque;
    private String immatriculation;
    private Integer annee;


    public Voiture(String nom, String marque, String immatriculation, Integer annee) {
        this.nom = nom;
        this.marque = marque;
        this.immatriculation = immatriculation;
        this.annee = annee;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }
}
