package com.ana.demo1;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class LoginWindow extends Stage {
    public LoginWindow() {
        GridPane loginGridPane = new GridPane();
        loginGridPane.setHgap(10);
        loginGridPane.setVgap(10);
        loginGridPane.setPadding(new Insets(20));

        // Ajoutez l'image d'arrière-plan
        Image backgroundImage = new Image("C:\\Users\\Lenovo\\Desktop\\my_app\\istockphoto-470614728-1024x1024.jpg");
        loginGridPane.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));
        // Ajoutez des champs de texte pour le nom d'utilisateur et le mot de passe
        TextField usernameField = new TextField();
        PasswordField passwordField = new PasswordField();

        loginGridPane.add(usernameField, 0, 0);
        loginGridPane.add(passwordField, 0, 1);

        // Ajoutez un bouton de connexion
        Button loginButton = new Button("Login");
        loginGridPane.add(loginButton, 0, 2);

        // Créez une nouvelle scène avec la grille
        Scene loginScene = new Scene(loginGridPane, 400, 300);

        // Définissez la scène pour cette fenêtre
        this.setScene(loginScene);
        this.setTitle("Login");
    }
}
