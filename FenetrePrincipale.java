package com.ana.demo1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FenetrePrincipale extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;

        Image backgroundImage = new Image("file:C:/Users/Lenovo/Desktop/my_app/joueur-football-masculin-ballon-terrain-herbe.jpg");
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        Background backgroundWithImage = new Background(background);
        GridPane gridPane = new GridPane();
        gridPane.setBackground(backgroundWithImage);
        gridPane.setAlignment(Pos.CENTER);
        Text welcomeText = new Text("Hello to our application MAM ");
        welcomeText.setFont(Font.font("Arial", FontWeight.BOLD, 50));
        welcomeText.setFill(Color.WHITE);
        gridPane.add(welcomeText, 0, 0);

        Button logInButton = new Button("Log In");
        logInButton.setStyle("-fx-background-color: #1E90FF; -fx-text-fill: white;");
        logInButton.setPrefSize(150, 50);

        logInButton.setOnAction(e -> {
            LoginWindow.display(primaryStage); // Passer primaryStage à la méthode display
        });

        GridPane.setMargin(logInButton, new Insets(40, 0, 0, 0));
        gridPane.add(logInButton, 0, 1);

        Scene scene = new Scene(gridPane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("MAM");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
