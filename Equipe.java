package com.ana.demo1;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private  ArrayList<Object> effectif;
    public String nom;
    public List<Joueur> Effectif;
    public String stade;
    public Entraineur entraîneur;
    public int Budget;

    // Constructeur
    public Equipe(String nom, String stade, Entraineur entraineur, int budget, ArrayList effectif) {
        this.nom = nom;
        this.stade = stade;
        this.entraîneur = entraineur;
        this.effectif = new ArrayList<>();
        this.Budget = budget;
    }
    // Méthode pour ajouter un joueur à l'effectif de l'équipe
    public void ajouterJoueur(Joueur joueur) {
        effectif.add(joueur);
    }
    // Méthode pour retirer un joueur de l'effectif de l'équipe
    public void retirerJoueur(Joueur joueur) {
        effectif.remove(joueur);
    }
    // getters et setters
    public String getNomCompétition(){
        return nom;
    }
    public void setNomCompetition(String nom){
        this.nom = nom;
    }
    public String getStade(){
        return stade;
    }
    public void setStade(String stade) {
        this.stade = stade;
    }
    public Entraineur getEntraineur(){
        return entraîneur;
    }
    public void setEntraîneur(Entraineur entraîneur) {
        this.entraîneur = entraîneur;
    }
    public ArrayList<Object> getEffectif() {
        return effectif;
    }
    public void setEffectif( List<Joueur> effectifActuel){
        this.Effectif = effectifActuel;
    }
    public int getBudget(){
        return Budget;
    }
    public void setBudget(int budget){
        this.Budget = budget;
    }

    public String getNom() {
        return nom;
    }
}