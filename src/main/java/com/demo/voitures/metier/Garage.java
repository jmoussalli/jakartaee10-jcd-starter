package com.demo.voitures.metier;

import java.util.ArrayList;

public class Garage {

    private final ArrayList<Voiture> voitures = new ArrayList<>();

    public void addVoiture(Voiture voiture) {
        voitures.add(voiture);
    }
    public ArrayList<Voiture> getVoitures() {
        return voitures;
    }
    public void supprimerVoiture(String nomVoiture) {
        int i=0;
        while (!voitures.get(i).getNom().equals(nomVoiture) && i<voitures.size()){
            i++;
        }
        if (i<voitures.size()) {
            voitures.remove(nomVoiture);
        }

//        for (Voiture v : voitures) {
//            if (v.getNom().equals(nomVoiture)){
//                voitures.remove(v);
//                break;
//            }
//        }

    }



}
