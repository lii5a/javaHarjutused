package teema2;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * 1. Loo sisse logimise ekraan (ainult visuaal)
 * 2. Määra üks võimalik kasutaja ja parool (andmebaasi veel ei kasuta)
 * 3. Ebaõnnestunud katse näitab kasutajale errorit
 * 4. Õnnestunud katse puhul vaheta pilt uue vastu (kasvõi roheline ring), .
 */
public class Harjutus3_logisisse extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox ruudud = new VBox();
        Scene login = new Scene(ruudud);
        primaryStage.setScene(login);
        primaryStage.show();

        Label kasutajaLabel= new Label("Sisesta kasutajanimi");
        TextField kasutajaInput = new TextField();

        Label parooliLabel = new Label("Sisesta parool");
        PasswordField kasutajaPassword = new PasswordField();

        Button logiSisse = new Button("Logi sisse");

        System.out.println();

        Label teade = new Label();




        ruudud.getChildren().addAll(kasutajaLabel, kasutajaInput, parooliLabel, kasutajaPassword, logiSisse, teade);

        //Sisse logitud vaade, kohe seda ei näita

        StackPane seesLayout = new StackPane();
        Scene seesScene = new Scene (seesLayout, 200, 200);
        Label seesLabel = new Label ("Oled sisse logitud, palju õnne!");
        seesLayout.getChildren().add(seesLabel);

        //Nupu tegevus
        logiSisse.setOnAction(event -> {
            String kasutaja = kasutajaInput.getText(); //ilma nendeta võrdleksin lihtsalt tekstivälja, mitte selle sisu
            String parool = kasutajaPassword.getText();
            if (kasutaja.equals("Liisa") && parool.equals("salakala")) {
                teade.setText("Tere tulemast");
            }
            else {
                teade.setText("Vale parool või kasutajanimi");
                kasutajaInput.setText(""); //tühjenda väli
                kasutajaPassword.setText(""); //tühjenda väli

            }
        });

        //Kui enterit vajutada, siis nagu oleks nuppu vajutanud
        kasutajaPassword.setOnKeyPressed(event -> {
            if (event.getCode().equals(KeyCode.ENTER)){
                logiSisse.fire();
            }
        });
        kasutajaInput.setOnKeyPressed(event -> {
            if (event.getCode().equals(KeyCode.ENTER))
            logiSisse.fire();
        });
    }
}

