// TransfertWindow.java
package com.ana.demo1;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class TransfertWindow {

    public static void display() {
        Stage transfertWindow = new Stage();
        transfertWindow.initModality(Modality.APPLICATION_MODAL);
        transfertWindow.setTitle("Transfert Window");
        VBox transfertLayout = new VBox();

        // Transfer 1
        Label transfer1Label = new Label("Player Messi transferred from FC Barcelona to Paris Saint-Germain");
        transfer1Label.setStyle("-fx-font-size: 16px; -fx-text-fill: #2c3e50;");
        transfertLayout.getChildren().add(transfer1Label);

        // Transfer 2
        Label transfer2Label = new Label("Player Ronaldo transferred from Juventus to Manchester United");
        transfer2Label.setStyle("-fx-font-size: 16px; -fx-text-fill: #2c3e50;");
        transfertLayout.getChildren().add(transfer2Label);

        // Transfer 3
        Label transfer3Label = new Label("Player Neymar transferred from Paris Saint-Germain to Barcelona");
        transfer3Label.setStyle("-fx-font-size: 16px; -fx-text-fill: #2c3e50;");
        transfertLayout.getChildren().add(transfer3Label);

        // Transfer 4
        Label transfer4Label = new Label("Player Mbappé transferred from Paris Saint-Germain to Real Madrid");
        transfer4Label.setStyle("-fx-font-size: 16px; -fx-text-fill: #2c3e50;");
        transfertLayout.getChildren().add(transfer4Label);

        Label transfer5Label = new Label("Player Bellingham transfered from Dortmund to Real Madrid ");
        transfer5Label.setStyle("-fx-font-size: 16px; -fx-text-fill: #2c3e50;");
        transfertLayout.getChildren().add(transfer5Label);
        Label transfer6Label = new Label("Player Lewandovski transferred from Bayern Munich to Barcelona");
        transfer6Label.setStyle("-fx-font-size: 16px; -fx-text-fill: #2c3e50;");
        transfertLayout.getChildren().add(transfer6Label);
        Label transfer7babel = new Label("Player Harry Kane transferred from Tottenham to Bayern Munich");
        transfer7babel.setStyle("-fx-font-size: 16px; -fx-text-fill: #2c3e50;");
        transfertLayout.getChildren().add(transfer7babel);
        Label transfer8Label = new Label("Player Neymar transferred from Paris Saint-Germain to Al Ahly");
        transfer8Label.setStyle("-fx-font-size: 16px; -fx-text-fill: #2c3e50;");
        transfertLayout.getChildren().add(transfer8Label);
        Label transfer9Label = new Label("Player Gvardiol transferred from RB Leipzig to  Manchester City");
        transfer9Label.setStyle("-fx-font-size: 16px; -fx-text-fill: #2c3e50;");
        transfertLayout.getChildren().add(transfer9Label);
        Label transfer10Label = new Label("Player Hojlund transferred from Atalanta to Manchester United");
        transfer10Label.setStyle("-fx-font-size: 16px; -fx-text-fill: #2c3e50;");
        transfertLayout.getChildren().add(transfer10Label);
        Label transfer11Label = new Label("Player Palmer transferred from Manchetser City to Chelsea");
        transfer11Label.setStyle("-fx-font-size: 16px; -fx-text-fill: #2c3e50;");
        transfertLayout.getChildren().add(transfer11Label);
        Label transfer12Label = new Label("Player Doku transferred from Stade Rennais to Manchester City");
        transfer12Label.setStyle("-fx-font-size: 16px; -fx-text-fill: #2c3e50;");
        transfertLayout.getChildren().add(transfer12Label);
        Label transfer13Label = new Label("Player Loftus-Check transferred from Chesea to Ac Milan");
        transfer13Label.setStyle("-fx-font-size: 16px; -fx-text-fill: #2c3e50;");
        transfertLayout.getChildren().add(transfer13Label);
        Label transfer14Label = new Label("Player Havertz transferred from Chelsea to Arsenal");
        transfer14Label.setStyle("-fx-font-size: 16px; -fx-text-fill: #2c3e50;");
        transfertLayout.getChildren().add(transfer14Label);
        Label transfer15Label = new Label("Player Declan Rice transferred from West-Ham to Arsenal");
        transfer15Label.setStyle("-fx-font-size: 16px; -fx-text-fill: #2c3e50;");
        transfertLayout.getChildren().add(transfer15Label);
        Label transfer16Label = new Label("Player Mac-Allister transferred from Brighton to Liverpool");
        transfer16Label.setStyle("-fx-font-size: 16px; -fx-text-fill: #2c3e50;");
        transfertLayout.getChildren().add(transfer16Label);
        transfertLayout.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));

        Scene scene = new Scene(transfertLayout, 600, 400);
        transfertWindow.setScene(scene);
        transfertWindow.showAndWait();
    }
}
