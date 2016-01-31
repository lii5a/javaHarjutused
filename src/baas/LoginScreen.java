package baas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by lii5a on 11/01/16.
 */
public class LoginScreen {
    public LoginScreen() { //konstruktor on pmõtselt meetod, millel on sama nimi kui klassil. tegelt võiks nupud olla eraldi meetodis.
        Stage stage = new Stage();
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox);

        Label kasutaja = new Label("Kasutaja label");
        TextField kasutajainput = new TextField();
        Label parool = new Label("Parool");
        TextField paroolInput = new TextField();
        Button loginButton = new Button("Logi sisse");
        Button regButton = new Button("Registreeri");
        vbox.getChildren().addAll(kasutaja, kasutajainput, parool, paroolInput, loginButton, regButton);
        stage.setScene(scene);
        stage.show();

        regButton.setOnAction(event -> {
            String kasutajanimi = kasutajainput.getText();
            String sala = paroolInput.getText();
            Andmebaas a = new Andmebaas();
            a.registreeriKasutaja(kasutajanimi, sala); //uus andmebaas, millele anname kaasa kasutajanimi ja salaparooli
            a.kuvaRead(kasutajanimi);
            a.sulgeYhendus();
        });

    }
}
