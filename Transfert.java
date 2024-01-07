package com.ana.demo1;

import java.time.LocalDate;
import java.util.List;

public interface Transfert {
    void transfererJoueur(Joueur joueur, Equipe ancienneEquipe, Equipe nouvelleEquipe, LocalDate dateTransfert);

    void transfererJoueur(Joueur joueur, Equipe ancienneEquipe, Equipe nouvelleEquipe);
}

class TransfertImpl implements Transfert {
    @Override
    public void transfererJoueur(Joueur joueur, Equipe ancienneEquipe, Equipe nouvelleEquipe, LocalDate dateTransfert) {
        if (joueur == null || ancienneEquipe == null || nouvelleEquipe == null || dateTransfert == null) {
            throw new IllegalArgumentException("Les informations sur le joueur, les équipes ou la date de transfert sont manquantes.");
        }

        if (!ancienneEquipe.getEffectif().contains(joueur))
            throw new IllegalArgumentException("Le joueur ne fait pas partie de l'équipe précédente.");

        if (joueur.getValeurMarchande() > nouvelleEquipe.getBudget()) {
            throw new IllegalArgumentException("La valeur marchande du joueur dépasse le budget de la nouvelle équipe.");
        }

        // Effectuer le transfert en utilisant les méthodes ajouterJoueur et retirerJoueur de la classe Equipe
        ancienneEquipe.retirerJoueur(joueur);
        nouvelleEquipe.ajouterJoueur(joueur);

        // Mettre à jour les budgets des équipes en utilisant les setters de l'attribut budget
        double prixTransfert = joueur.getValeurMarchande();
        ancienneEquipe.setBudget((int) (ancienneEquipe.getBudget() + prixTransfert));
        nouvelleEquipe.setBudget((int) (nouvelleEquipe.getBudget() - prixTransfert));

        // Mettre à jour la référence de l'équipe actuelle du joueur
        joueur.setEquipeActuelle(nouvelleEquipe);

        // Ajouter l'équipe précédente à la liste d'équipes précédentes du joueur
        List<Equipe> equipesPrecedentes = joueur.getEquipesPrecedentes();
        equipesPrecedentes.add(ancienneEquipe);
        joueur.setEquipesPrecedentes(equipesPrecedentes);
    }

    @Override
    public void transfererJoueur(Joueur joueur, Equipe ancienneEquipe, Equipe nouvelleEquipe) {

    }
}

