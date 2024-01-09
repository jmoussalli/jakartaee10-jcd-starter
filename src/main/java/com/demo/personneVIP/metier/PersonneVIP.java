package com.demo.personneVIP.metier;

public class PersonneVIP {
    private String prenom;
    private String nom;
    private String VIP;

    public PersonneVIP(String prenom, String nom, String VIP) {
        this.prenom = prenom;
        this.nom = nom;
        this.VIP = VIP;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVIP() {
        return VIP;
    }

    public void setVIP(String VIP) {
        this.VIP = VIP;
    }
}
