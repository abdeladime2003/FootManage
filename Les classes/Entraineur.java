package com.ana.demo1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Entraineur extends Personne implements Serializable {
    private int age;
    private String nationalite;
    private Equipe equipeActuelle;
    private List<Equipe> equipesPrecedentes;
    private Map<Competition, Integer> palmares;

    public Entraineur(String nom, String prenom, int age, String nationalite, Equipe equipe) {
        super(nom, prenom);
        this.age = age;
        this.nationalite = nationalite;
        this.equipeActuelle = equipe;
        this.equipesPrecedentes = new ArrayList<>();
        this.palmares = new HashMap<>();
    }

    public Entraineur(String nom, String prenom) {
        super(nom, prenom);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public void ajouterEquipePrecedente(Equipe equipe) {
        this.equipesPrecedentes.add(equipe);
    }

    public void ajouterVictoire(Competition competition) {
        int victoires = this.palmares.getOrDefault(competition, 0);
        this.palmares.put(competition, victoires + 1);
    }
}
