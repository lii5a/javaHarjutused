        /**
        * Created by liisa on 31/10/15.
        */

        package teema1;

        import javafx.application.Application;
        import javafx.stage.Stage;
        import lib.Foor;

        public class Peamurdja1_ise extends Application {

        @Override //extendime applicationit, seal n start-meetod juba olemas, see kirjutatakse üle
        public void start(Stage primaryStage) throws Exception {
        Foor foor = new Foor();


        for(int i=1; i<5; i++){

        foor.vahetaPunast();
        foor.paus(3);
        foor.vahetaKollast();
        foor.paus(1);
        foor.kustutaPunane();
        foor.kustutaKollane();
        foor.vahetaRohelist();
        foor.paus(3);
        foor.kustutaRoheline();
        foor.paus(0.5);
        for (int j=0;j<3; j++){
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.kustutaRoheline();
        foor.paus(0.5);}
        foor.vahetaKollast();
        foor.paus(2);
        foor.kustutaKollane();
}
}
}