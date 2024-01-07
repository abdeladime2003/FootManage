package com.ana.demo1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
public class Entraineur extends Personne{

    private int Age; // Map pour stocker les caractéristiques (incluant l'âge, la taille et le poids)
    private String nationalite; // Nationalité du joueur
    private Equipe equipeActuelle;
    private List<Equipe> equipesPrecedentes;
    private Map<Competition, Integer> palmares;

    public Entraineur(String nom, String prenom, int age, String nationalite, Equipe equipe) {
        super(nom, prenom);
        this.Age = age;
        this.nationalite = nationalite;
        this.equipeActuelle = equipe;
        this.equipesPrecedentes = new ArrayList<>();
        this.palmares = new HashMap<>();

    }

    public Entraineur(String nom, String prenom) {
        super(nom, prenom);
    }

    // Getters et setters pour les attributs

    public int getAge(){
        return Age;
    }

    public void setAge(int age){
        this.Age = age;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public Equipe getEquipeActuelle() {
        return equipeActuelle;
    }

    public void setEquipeActuelle(Equipe equipeActuelle) {
        this.equipeActuelle = equipeActuelle;
    }

    public List<Equipe> getEquipesPrecedentes() {
        return equipesPrecedentes;
    }

    public void setEquipesPrecedentes(List<Equipe> equipesPrecedentes) {
        this.equipesPrecedentes = equipesPrecedentes;
    }

    public Map<Competition, Integer> getPalmares() {
        return palmares;
    }

    public void setPalmares(Map<Competition, Integer> palmares) {
        this.palmares = palmares;
    }


    // Méthodes spécifiques pour gérer l'ajout des équipes précédentes et du palmarès
    public void ajouterEquipePrecedente(Equipe equipe) {
        this.equipesPrecedentes.add(equipe);
    }

    public void ajouterVictoire(Competition competition) {
        int victoires = this.palmares.getOrDefault(competition, 0);
        this.palmares.put(competition, victoires + 1);
    }
}
