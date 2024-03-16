package com.ana.demo1;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;
public class Competition implements Serializable {
    public enum Niveau{
        Regional,
        National,
        Continental,
        Mondial
    }
    public enum Systeme{
        Championnat,
        Coupe
    }
    public enum TypeEquipe{
        Club,
        Selection
    }
    public String nomCompetition;
    public int nombreParticipants;
    public LocalDate dateCreation;
    public static TypeEquipe TypeEquipe;
    public static Systeme Systeme;
    public static Niveau Niveau;
    public Map<String, String> historique;

    public Competition(String nomCompetition, int nombreParticipants, LocalDate dateCreation, String type, Niveau niveau, TypeEquipe typeEquipe, Systeme systeme) {
        this.nomCompetition = nomCompetition;
        this.nombreParticipants = nombreParticipants;
        this.dateCreation = dateCreation;
        this.TypeEquipe = typeEquipe;
        this.Systeme = systeme;
        this.Niveau = niveau;
        this.historique = new HashMap<>();
    }
    public String getNomCompetition() {
        return nomCompetition;
    }

    public void setNomCompetition(String nomCompetition) {
        this.nomCompetition = nomCompetition;
    }

    public int getNombreParticipants() {
        return nombreParticipants;
    }

    public void setNombreParticipants(int nombreParticipants) {
        this.nombreParticipants = nombreParticipants;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public TypeEquipe getTypeEquipe() {
        return TypeEquipe;
    }

    public void setTypeEquipe(TypeEquipe typeEquipe) {
        this.TypeEquipe = typeEquipe;
    }

    public Systeme getSysteme(){
        return Systeme;
    }

    public void setSystemet(Systeme systeme){
        this.Systeme = systeme;
    }

    public Niveau getNiveau(){
        return Niveau;
    }

    public void setNiveau( Niveau niveau){
        this.Niveau = niveau;
    }

    public Map<String, String> getHistorique() {
        return historique;
    }

    public void setHistorique(Map<String, String> Hist) {
        this.historique = Hist;
    }
    public Map<String, String> miseAJourHistorique(Equipe equipeGagnante, int annee) {
        if (equipeGagnante != null && annee > 0) {
            if (annee < dateCreation.getYear()) {
                throw new IllegalArgumentException("L'année de la compétition ne peut pas être antérieure à l'année de création.");
            }

            String nomEquipeGagnante = equipeGagnante.getNomCompétition();
            if (historique.containsKey(String.valueOf(annee))) {
                throw new IllegalArgumentException("L'année spécifiée est déjà présente dans l'historique.");
            }

            historique.put(String.valueOf(annee), nomEquipeGagnante);
        }

        return null;
    }

}