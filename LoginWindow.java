package com.ana.demo1;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginWindow {

    public static void display(Stage primaryStage) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Login");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20, 20, 20, 20));

        Image backgroundImage = new Image("file:C:/Users/Lenovo/Desktop/my_app/istockphoto-470614728-1024x1024.jpg");
        gridPane.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));

        ImageView imageView = new ImageView(backgroundImage);
        imageView.setFitWidth(300);
        imageView.setFitHeight(200);

        Label nameLabel = new Label("Username:");
        TextField nameField = new TextField();

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();

        Button loginButton = new Button("Log In");
        loginButton.setStyle("-fx-background-color: #1E90FF; -fx-text-fill: white;");

        loginButton.setOnAction(e -> {
            if (nameField.getText().equals("stormy") && passwordField.getText().equals("1937")) {
                showOptions(primaryStage);
            } else {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setContentText("Error of login");
                error.show();
            }
            window.close();
        });

        gridPane.add(imageView, 0, 0, 2, 1);
        gridPane.add(nameLabel, 0, 1);
        gridPane.add(nameField, 1, 1);
        gridPane.add(passwordLabel, 0, 2);
        gridPane.add(passwordField, 1, 2);
        gridPane.add(loginButton, 1, 3);

        Scene scene = new Scene(gridPane, 400, 300);
        window.setScene(scene);
        window.showAndWait();
    }

    private static void showOptions(Stage primaryStage) {
        // Créer une nouvelle scène avec les options après le login réussi
        GridPane optionsPane = new GridPane();
        optionsPane.setAlignment(Pos.CENTER);
        optionsPane.setHgap(10);
        optionsPane.setVgap(10);
        optionsPane.setPadding(new Insets(20, 20, 20, 20));

        // Ajouter une image d'arrière-plan
        Image backgroundOptions = new Image("file:C:/Users/Lenovo/Desktop/my_app/istockphoto-508552962-1024x1024.jpg");
        optionsPane.setBackground(new Background(new BackgroundImage(backgroundOptions,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT)));

        // Bouton "Equipe"
        Button equipeButton = new Button("Equipe");
        equipeButton.setStyle("-fx-background-color: white; -fx-text-fill: black; -fx-border-color: white;");
        equipeButton.setPrefSize(150, 150);
        equipeButton.setShape(new Circle(75)); // Forme circulaire

        Button transfertButton = new Button("Transfert");
        transfertButton.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-border-color: white;");
        transfertButton.setPrefSize(150, 150);
        transfertButton.setShape(new Circle(75));

// Bouton "Compétition"
        Button competitionButton = new Button("Compétition");
        competitionButton.setStyle("-fx-background-color: #3498db; -fx-text-fill: white;");
        competitionButton.setPrefSize(150, 150);
        competitionButton.setShape(new Circle(75));


        // Ajouter les boutons à la grille
        optionsPane.add(equipeButton, 0, 0);
        optionsPane.add(transfertButton, 0, 1);
        optionsPane.add(competitionButton, 0, 2);

        // Créer une nouvelle scène avec la grille des options
        Scene optionsScene = new Scene(optionsPane, 800, 600);

        // Définir la nouvelle scène pour la fenêtre principale
        primaryStage.setScene(optionsScene);
    }
}
