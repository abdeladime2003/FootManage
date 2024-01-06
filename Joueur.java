package validation_inchallah;
import java.util.*;
class Joueur extends Personne {
    private String poste;
    private Map<String, Object> caracteristiques; // Map pour stocker les caractéristiques (incluant l'âge, la taille et le poids)
    private String nationalite; // Nationalité du joueur
    private Equipe equipeActuelle;
    private List<Equipe> equipesPrecedentes;
    private Map<Competition, Integer> palmares;
    private int ValeurMarchande;

    //Constructeur paramétré de la classe Joueur

    public Joueur(String nom, String prenom, String poste, double taille, double poids, int age, String nationalite, Equipe equipe, int valeur) {
        super(nom, prenom);
        this.poste = poste;

        // Initialisation du Map pour les caractéristiques
        this.caracteristiques = new HashMap<>();
        this.caracteristiques.put("taille", taille);
        this.caracteristiques.put("poids", poids);
        this.caracteristiques.put("age", age);

        this.nationalite = nationalite;
        this.equipeActuelle = equipe;
        this.equipesPrecedentes = new ArrayList<>();
        this.palmares = new HashMap<>();
        this.ValeurMarchande = valeur;
    }

    // Getters et setters pour les attributs
    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public Map<String, Object> getCaracteristiques() {
        return caracteristiques;
    }

    public void setCaracteristiques(Map<String, Object> caracteristiques) {
        this.caracteristiques = caracteristiques;
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
    public int getValeurMarchande(){
        return ValeurMarchande;
    }
    public void setValeurMarchande(int valeur){
        this.ValeurMarchande = valeur;
    }

    // Méthodes spécifiques pour gérer l'ajout des équipes précédentes et du palmarès
    public void ajouterEquipePrecedente(Equipe equipe) {
        this.equipesPrecedentes.add(equipe);
    }

    public void ajouterVictoire(Competition competition) {
        int victoires = this.palmares.getOrDefault(competition, 0);
        this.palmares.put(competition, victoires + 1);
    }

    // Autres méthodes spécifiques
    // ...
}
