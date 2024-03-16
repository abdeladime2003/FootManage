package com.ana.demo1;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.time.LocalDate;

public class LoginWindow extends Application {

    public static void main(String[] args) {
        launch(args);
    }

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

        loginButton.setOnAction(_ -> {
            if (nameField.getText().equals("stormy") && passwordField.getText().equals("1937")) {
                showOptions();
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

    private static void showOptions() {
        Stage optionsWindow = new Stage();
        optionsWindow.initModality(Modality.APPLICATION_MODAL);
        optionsWindow.setTitle("Options");
        GridPane optionsPane = new GridPane();
        optionsPane.setAlignment(Pos.CENTER);
        optionsPane.setHgap(10);
        optionsPane.setVgap(10);
        optionsPane.setPadding(new Insets(20, 20, 20, 20));
        Button equipeButton = new Button("Equipe");
        equipeButton.setStyle("-fx-background-color: white; -fx-text-fill: black; -fx-border-color: white;");
        equipeButton.setPrefSize(150, 150);
        equipeButton.setShape(new Circle(75));

        Button transfertButton = new Button("Transfert");
        transfertButton.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-border-color: white;");
        transfertButton.setPrefSize(150, 150);
        transfertButton.setShape(new Circle(75));
        Button competitionButton = new Button("Compétition");
        competitionButton.setStyle("-fx-background-color: #3498db; -fx-text-fill: white;");
        competitionButton.setPrefSize(150, 150);

        equipeButton.setOnAction(_ -> {
            EquipeWindow.display();
        });

        transfertButton.setOnAction(_ -> {
            TransfertWindow.display();
        });

        competitionButton.setOnAction(_ -> {
            CompetitionWindow.display();
        });

        optionsPane.add(equipeButton, 0, 0);
        optionsPane.add(transfertButton, 0, 1);
        optionsPane.add(competitionButton, 0, 2);

        Scene optionsScene = new Scene(optionsPane, 800, 600);
        optionsWindow.setScene(optionsScene);
        optionsWindow.showAndWait();
    }
    private static void showCompetitions() {

        Stage competitionsWindow = new Stage();
        competitionsWindow.initModality(Modality.APPLICATION_MODAL);
        competitionsWindow.setTitle("Competitions");
        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        Competition competition1 = new Competition("Ligue 1", 20, LocalDate.now(), "Club", Competition.Niveau.Continental, Competition.TypeEquipe.Club, Competition.Systeme.Championnat);
        Competition competition2 = new Competition("World Cup", 32, LocalDate.now(), "Selection", Competition.Niveau.Mondial, Competition.TypeEquipe.Selection, Competition.Systeme.Coupe);

        Label competitionLabel1 = new Label(getCompetitionDetails(competition1));
        Label competitionLabel2 = new Label(getCompetitionDetails(competition2));

        vbox.getChildren().addAll(competitionLabel1, competitionLabel2);

        Scene competitionsScene = new Scene(vbox, 400, 300);
        competitionsWindow.setScene(competitionsScene);
        competitionsWindow.showAndWait();
    }
    private static String getCompetitionDetails(Competition competition) {
        return STR."Competition: \{competition.getNomCompetition()}, Participants: \{competition.getNombreParticipants()}, Type: \{competition.getTypeEquipe()}, Niveau: \{competition.getNiveau()}, Systeme: \{competition.getSysteme()}";
    }


    @Override
    public void start(Stage stage) throws Exception {

    }
}
