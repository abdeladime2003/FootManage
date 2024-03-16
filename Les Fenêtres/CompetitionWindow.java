
package com.ana.demo1;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.time.LocalDate;

public class CompetitionWindow {

    public static void display() {
        Stage competitionWindow = new Stage();
        competitionWindow.initModality(Modality.APPLICATION_MODAL);
        competitionWindow.setTitle("Competition Window");
        VBox competitionLayout = new VBox();
        Competition competition1 = new Competition("Ligue 1", 20, LocalDate.now(), "Club", Competition.Niveau.Continental, Competition.TypeEquipe.Club, Competition.Systeme.Championnat);
        Label competition1Label = new Label(getCompetitionDetails(competition1));
        competition1Label.setStyle("-fx-font-size: 16px; -fx-text-fill: #2c3e50;");
        competitionLayout.getChildren().add(competition1Label);
        Competition competition2 = new Competition("World Cup", 32, LocalDate.now(), "Selection", Competition.Niveau.Mondial, Competition.TypeEquipe.Selection, Competition.Systeme.Coupe);
        Label competition2Label = new Label(getCompetitionDetails(competition2));
        competition2Label.setStyle("-fx-font-size: 16px; -fx-text-fill: #2c3e50;");
        competitionLayout.getChildren().add(competition2Label);
        addCompetition("Ligue Espagne", 20, LocalDate.now(), "Club", Competition.Niveau.National, Competition.TypeEquipe.Club, Competition.Systeme.Championnat, competitionLayout);
        addCompetition("Bundesliga", 18, LocalDate.now(), "Club", Competition.Niveau.National, Competition.TypeEquipe.Club, Competition.Systeme.Championnat, competitionLayout);
        addCompetition("Botola Maroc", 16, LocalDate.now(), "Club", Competition.Niveau.National, Competition.TypeEquipe.Club, Competition.Systeme.Championnat, competitionLayout);
        addCompetition("Premier League", 20, LocalDate.now(), "Club", Competition.Niveau.National, Competition.TypeEquipe.Club, Competition.Systeme.Championnat, competitionLayout);
        addCompetition("League Des Champions", 32, LocalDate.now(), "Club", Competition.Niveau.Continental, Competition.TypeEquipe.Club, Competition.Systeme.Coupe, competitionLayout);
        addCompetition("EURO", 24, LocalDate.now(), "Selection", Competition.Niveau.Continental, Competition.TypeEquipe.Selection, Competition.Systeme.Coupe, competitionLayout);
        addCompetition("Coupe Du Monde", 32, LocalDate.now(), "Selection", Competition.Niveau.Mondial, Competition.TypeEquipe.Selection, Competition.Systeme.Coupe, competitionLayout);
        addCompetition("Ligue 1", 20, LocalDate.now(), "Club", Competition.Niveau.National, Competition.TypeEquipe.Club, Competition.Systeme.Championnat, competitionLayout);
        addCompetition("Serie A", 20, LocalDate.now(), "Club", Competition.Niveau.National, Competition.TypeEquipe.Club, Competition.Systeme.Championnat, competitionLayout);
        addCompetition("CAN",24 , LocalDate.now(), "Selection", Competition.Niveau.Continental, Competition.TypeEquipe.Selection, Competition.Systeme.Coupe, competitionLayout);
        addCompetition("Copa America", 16, LocalDate.now(), "Selection", Competition.Niveau.Continental, Competition.TypeEquipe.Selection, Competition.Systeme.Coupe, competitionLayout);

        competitionLayout.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));

        Scene scene = new Scene(competitionLayout, 600, 400);
        competitionWindow.setScene(scene);
        competitionWindow.showAndWait();
    }

    private static String getCompetitionDetails(Competition competition) {
        return "Competition: " + competition.getNomCompetition() +
                ", Participants: " + competition.getNombreParticipants() +
                ", Type: " + competition.getTypeEquipe() +
                ", Niveau: " + competition.getNiveau() +
                ", Systeme: " + competition.getSysteme();
    }

    private static void addCompetition(String name, int participants, LocalDate date, String type, Competition.Niveau niveau, Competition.TypeEquipe typeEquipe, Competition.Systeme systeme, VBox layout) {
        Competition competition = new Competition(name, participants, date, type, niveau, typeEquipe, systeme);
        Label competitionLabel = new Label(getCompetitionDetails(competition));
        competitionLabel.setStyle("-fx-font-size: 16px; -fx-text-fill: #2c3e50;");
        layout.getChildren().add(competitionLabel);
    }
}
