package com.demo.personneVIP.metier;

import java.util.ArrayList;

public class Annuaire {
    private final ArrayList<PersonneVIP> personneVIPs = new ArrayList<>();

    public void addPersonneVIP(PersonneVIP personneVIP) {
        personneVIPs.add(personneVIP);
    }
    public ArrayList<PersonneVIP> getPersonneVIPs() {
        return personneVIPs;
    }
    public void supprimerPersonneVIP(String nomPersonneVIP) {
        int i=0;
        while (!personneVIPs.get(i).getNom().equals(nomPersonneVIP) && i<personneVIPs.size()){
            i++;
        }
        if (i<personneVIPs.size()) {
            personneVIPs.remove(personneVIPs.get(i));
        }

//        for (PersonneVIP v : personneVIPs) {
//            if (v.getNom().equals(nomPersonneVIP)){
//                personneVIPs.remove(v);
//                break;
//            }
//        }

    }
}
