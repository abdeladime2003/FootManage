package validation_inchallah;
import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nom;
    private List<Joueur> effectif;
    private String stade;
    private String entraîneur;
    private int annee_de_naissance;

    // Constructeur
    public Equipe(String nom) {
        this.nom = nom;
        this.effectif = new ArrayList<>();
    }

    // Méthode pour ajouter un joueur à l'effectif de l'équipe
    public void ajouterJoueur(Joueur joueur) {
        effectif.add(joueur);
    }

    // Méthode pour retirer un joueur de l'effectif de l'équipe
    public void retirerJoueur(Joueur joueur) {
        effectif.remove(joueur);
    }

    // Méthode pour définir le stade associé à l'équipe
    public void setStade(String stade) {
        this.stade = stade;
    }

    // Méthode pour définir l'entraîneur de l'équipe
    public void setEntraîneur(String entraîneur) {
        this.entraîneur = entraîneur;
    }

    // Autres méthodes et getters nécessaires en fonction des besoins

    // Getter pour l'effectif de l'équipe
    public List<Joueur> getEffectif() {
        return effectif;
    }
}
