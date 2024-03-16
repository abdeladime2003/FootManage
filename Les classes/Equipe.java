package com.ana.demo1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Equipe implements Serializable {
    private final String nom;
    private List<Joueur> effectif;
    private String stade;
    private Entraineur entraineur;
    private int budget;
    public Equipe(String nom, String stade, Entraineur entraineur, int budget) {
        this.nom = nom;
        this.stade = stade;
        this.entraineur = entraineur;
        this.effectif = new ArrayList<>();
        this.budget = budget;
    }
    public void ajouterJoueur(Joueur joueur) {
        effectif.add(joueur);
    }
    public void retirerJoueur(Joueur joueur) {
        effectif.remove(joueur);
    }

    public String getNom() {
        return nom;
    }

    public String getStade() {
        return stade;
    }

    public void setStade(String stade) {
        this.stade = stade;
    }

    public Entraineur getEntraineur() {
        return entraineur;
    }

    public void setEntraineur(Entraineur entraineur) {
        this.entraineur = entraineur;
    }

    public List<Joueur> getEffectif() {
        return effectif;
    }

    public void setEffectif(List<Joueur> effectif) {
        this.effectif = effectif;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }


    public String getNomCompétition() {
        return null;
    }
}
