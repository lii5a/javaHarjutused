/**
 * Created by liisa on 02/11/15.
 */
package teema1;
import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

public class Ristmik_ise extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor_ylemine = new Foor(Foor.FooriSuund.YLEMINE, primaryStage);
        Foor foor_alumine = new Foor(Foor.FooriSuund.ALUMINE, primaryStage);
        Foor foor_parem = new Foor(Foor.FooriSuund.PAREM, primaryStage);
        Foor foor_vasak = new Foor(Foor.FooriSuund.VASAK, primaryStage);
        //progesin kõik foorid korraga töötama, mõtlesin tuli-tuli haaval, et mis nüüd juhtuma hakkab.
        //võib-olla teen selle harjutuse kunagi uuesti ja topin mitu meetodit üksteise sisse nagu KristerV praksis tegi :)
        for (int k=0; k<5; k++) {
            teeRoheliseks(foor_ylemine);
            teeRoheliseks(foor_alumine);
            teePunaseks(foor_parem);
            teePunaseks(foor_vasak);
            teeKollaseks(foor_ylemine);
            teeKollaseks(foor_alumine);
            teePunaseks(foor_ylemine);
            teePunaseks(foor_alumine);
            teeKollaseks(foor_parem);
            teeKollaseks(foor_vasak);
            teeRoheliseks(foor_parem);
            teeRoheliseks(foor_vasak);
            teeKollaseks(foor_vasak);
            teeKollaseks(foor_parem);
            teeKollaseks(foor_ylemine);
            teeKollaseks(foor_alumine);
        }
    }
    public void teeRoheliseks(Foor foor) {
        foor.vahetaRohelist();
        foor.paus(3);
        foor.kustutaRoheline();
        for (int i = 0; i < 4; i++) {
            foor.vahetaRohelist();
            foor.paus(0.5);
        }
        foor.kustutaRoheline();
    }
    public void teePunaseks(Foor foor) {
        foor.vahetaPunast();
        foor.paus(6);
    }
    public void teeKollaseks(Foor foor) {
        foor.vahetaKollast();
        foor.paus(3);
        foor.kustutaKollane();
        foor.kustutaPunane();
    }
}