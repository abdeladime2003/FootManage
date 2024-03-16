// EquipeWindow.java
package com.ana.demo1;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class EquipeWindow {

    public static void display() {
        Stage equipeWindow = new Stage();
        equipeWindow.initModality(Modality.APPLICATION_MODAL);
        equipeWindow.setTitle("Equipe Window");
        TabPane tabPane = new TabPane();

        // Team 1: Wydad Casablanca
        Tab wydadTab = new Tab("Wydad Casablanca");
        VBox wydadLayout = createTeamLayout("Wydad Casablanca", "Coach: benzarty", "Player 1: Jebrane", "Player 2: Amloud", "Player 3: Mourid", "Player 4: Bah", "Player 5: Harkass", "Player 6: Zola", "Player 7: Farhane", "Player 8: Aboulfath", "Player 9: El Anabi", "Player 10: Attiyat Allah", "Player 11: Chetti", "Player 12: Amri", "Player 13: El Amloud", "Player 14: Ait Brayem", "Player 15: Jabrane", "Player 16: Draoui", "Player 17: Serrhat", "Player 18: Baaouch", "Player 19: Mahrous", "Player 20: Haimoud", "Player 21: Moutaraji", "Player 22: El Houni", "Player 23: El Moutaraji", "Player 24: Ahannach", "Player 25: Khannouss", "Player 26: Lahtimi", "Player 27: Ounajem", "Player 28: Bouhra", "Player 29: Boussefiane", "Player 30: Benyachou", "Player 31: Sambou", "Player 32: El Bahri", "Player 33: Habach");
        wydadTab.setContent(wydadLayout);

        // Team 2: FC Barcelona
        Tab barcelonaTab = new Tab("FC Barcelona");
        VBox barcelonaLayout = createTeamLayout("Fc Barcelona", "Coach: Xavi", "Player 1: Marc-André ter Stegen", "Player 2: Iñaki Peña", "Player 3: Ronald Araujo", "Player 4: Jules Koundé", "Player 5: Andreas Christensen", "Player 6: Iñigo Martínez", "Player 7: Alejandro Balde", "Player 8: Marcos Alonso", "Player 9: João Cancelo", "Player 10: Oriol Romeu", "Player 11: Gavi", "Player 12: Pedri", "Player 13: Frenkie de Jong", "Player 14: İlkay Gündoğan", "Player 15: Fermín López", "Player 16: Sergi Roberto", "Player 17: João Félix", "Player 18: Ferran Torres", "Player 19: Lamine Yamal", "Player 20: Raphinha", "Player 21: Vitor Roque", "Player 22: Robert Lewandowski");
        barcelonaTab.setContent(barcelonaLayout);

        tabPane.getTabs().addAll(wydadTab, barcelonaTab);
        BackgroundFill backgroundFill = new BackgroundFill(Color.LIGHTBLUE, null, null);
        Background background = new Background(backgroundFill);
        tabPane.setBackground(background);
        Scene scene = new Scene(tabPane, 500, 400);
        setFontSizes(wydadLayout);
        setFontSizes(barcelonaLayout);
        equipeWindow.setScene(scene);

        equipeWindow.showAndWait();
    }

    private static VBox createTeamLayout(String teamName, String coach, String... players) {
        VBox teamLayout = new VBox();
        teamLayout.getChildren().add(new Label("Equipe Details:"));
        teamLayout.getChildren().add(new Label("Team Name: " + teamName));
        teamLayout.getChildren().add(new Label(coach));
        teamLayout.getChildren().add(new Label("Players:"));

        for (String player : players) {
            Label playerLabel = new Label(player);
            teamLayout.getChildren().add(playerLabel);
        }

        return teamLayout;
    }

    private static void setFontSizes(VBox teamLayout) {
        for (javafx.scene.Node node : teamLayout.getChildren()) {
            if (node instanceof Label) {
                Label label = (Label) node;
                label.setFont(Font.font("Arial", 14)); // Adjust the font size as needed
            }
        }
    }
}
