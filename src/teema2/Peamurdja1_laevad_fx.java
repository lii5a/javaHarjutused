package teema2;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Joonista laevade pommitamine kasutades JavaFXi.
 */
public class Peamurdja1_laevad_fx extends Application {
    Stage lava; //paneme lava globaalseks muutujaks, sest seda igal pool vaja
    StackPane maailm;
    GridPane laud; //kas siin võiks ka öelda, et võrdub new grid pane?
    int laevaServaPikkus=50;
    int lauaPikkus = 5;
    Image laevaPilt = new Image("teema2/pirate.png");
    ImagePattern laevaMuster = new ImagePattern(laevaPilt);

    @Override
    public void start(Stage primaryStage) throws Exception {
        lava = primaryStage; //aken ise
        seadistaLava(); //siin seadistame JavaFxi vajalikud asjad
        genereeriGrid();
        reageeriKlikile();

    }

    private void reageeriKlikile() {
        laud.setOnMouseClicked(event -> { //kle laud, kui sulle klikatakse (setonMouseClicked), siis toimub selline sündmus
            Rectangle ruut = (Rectangle) event.getTarget(); //ütleb mulle kes on see, kelle peale reaalselt klikati
            String ruuduID = ruut.getId(); //sellega saan kätte, kas on laev või meri.
            if (ruuduID.equals ("laev")) {
                System.out.println("pihtas!");
                ruut.setFill(laevaMuster);
                ruut.setId("pohjas");
            }
            else if (ruuduID.equals ("meri")) {
                System.out.println("möödas!");
                ruut.setFill(Color.GREY);
            }
            else if (ruuduID.equals("pohjas")) {
                System.out.println("kle juba lasid siia");
            }
            if (!laevasidAlles()) { //kui siin klikkimine käib ja laevasid ei ole alles enam
                gameover(); //siis käivitub gameover meetod.
                System.out.println("geim õuver");//see juhtub konsoolis

            }
        });
    }

    private void gameover() {
        Label manglabi = new Label("OVER");
        maailm.getChildren().add(manglabi);
        manglabi.setFont(new Font("Arial", 30));
        manglabi.setTextFill(Color.web("#b22222"));
    }

    private boolean laevasidAlles() {
        for (Node allesruut : laud.getChildren()) { //võtan ühest hunnikust, st getchildren, asju ükshaaval välja
            if (allesruut.getId().equals("laev")) { //kui mõni laev on alles, siis tagastab true ja ülejäänud meetod teda ei huvita.
                return true;
            }
        }
        return false;
    }


    private void genereeriGrid() { //loome hulga ruudukesi kindla küljepikkusega. anname neile rändomiga ID ja värvime ära, raamid ka.
        for (int i = 0; i < lauaPikkus; i++) {
            for (int j = 0; j < lauaPikkus ; j++) {
            Rectangle ruut = new Rectangle(laevaServaPikkus, laevaServaPikkus); //vorbin ruute, küljepikkusega laevaServaPikkus
            int random = (int)(Math.random()*2);
            if (random==1) {
                ruut.setId("meri");
            } else {
                    ruut.setId("laev");
                }
                ruut.setFill(Color.BLUE);
                ruut.setStroke(Color.WHITE);
                laud.add(ruut, i, j); //siin on erand ja ei tule getchildren, vaid kohe add
            }
        }
    }

    private void seadistaLava() { //private, sest kasutame ainult siin klassis. tagastab voidi.
        maailm = new StackPane();
        laud = new GridPane(); //teen ruudustiku
        maailm.getChildren().add(laud);

        Scene manguStseen = new Scene(maailm, laevaServaPikkus*lauaPikkus, laevaServaPikkus*lauaPikkus); //aken ise ülal on, teen ka stseeni
        lava.setScene(manguStseen);
        lava.show();
        lava.setOnCloseRequest(event -> {System.exit(0); }); //garanteerib, et kui risti vajutada, siis programm lõpetab.

    }
}
