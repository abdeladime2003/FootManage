package com.ana.demo1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Joueur extends Personne implements Serializable {
    private String poste;
    private double taille;
    private double poids;
    private String nationalite;
    private Equipe equipeActuelle;
    private List<Equipe> equipesPrecedentes;
    private Map<Competition, Integer> palmares;
    private int valeurMarchande;
    private int age;

    public Joueur(String nom, String prenom, String poste, double taille, double poids, int age, String nationalite, int valeur) {
        super(nom, prenom);
        this.poste = poste;
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.nationalite = nationalite;
        this.equipesPrecedentes = new ArrayList<>();
        this.palmares = new HashMap<>();
        this.valeurMarchande = valeur;
    }

    public int getValeurMarchande() {
        return valeurMarchande;
    }

    public void setEquipeActuelle(Equipe nouvelleEquipe) {
        this.equipeActuelle=nouvelleEquipe;
    }

    public List<Equipe> getEquipesPrecedentes() {

        return null;
    }

    public void setEquipesPrecedentes(List<Equipe> equipesPrecedentes) {
    }

    public void ajouterEquipePrecedente(Equipe equipe) {
    }

    public Equipe getEquipeActuelle() {
        return equipeActuelle;
    }
}
