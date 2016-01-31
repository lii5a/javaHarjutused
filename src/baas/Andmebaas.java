package baas;

import java.sql.*;

/**
 * Created by lii5a on 11/01/16.
 */
public class Andmebaas {

    Connection conn;

    public Andmebaas() {
        seadistaDB();


    }

    private void seadistaDB() { //ühenduse loomine DBga
        try { //baasiga seoses võib alati tulla error, aga seepärst eitaaha programmi ju kinni jooksutada. seepärast alati vaja trycatchi
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:login.db");
            //siia saab kirjutada, kuhu ühendada. jdbc:squlite on
            // kohustuslik, edasi kirjuta mida tahad. see on fail, kus on DB
            System.out.println("andmebaas käivitus");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void sulgeYhendus() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void seadistaTabel() {
        //andmebaas juba käib ja saan seda kasutama hakata
        //esiteks loome päringu objekti. päringu objekt on statement.
        try {
            Statement stat = conn.createStatement();
            String sql = "CREATE TABLE USER (ID INT AUTO_INCREMENT, USERNAME TEXT, PASSWORD TEXT, FULLNAME TEXT, TELEFON TEXT, AADRESS TEXT);"; //hea on sql-le ka semikoolon panna sulgude lõppu
           stat.executeUpdate(sql); //käivitan käsu
            stat.close();
            System.out.println("tabel on loodud");
            //tühik on järgmine käsk - nimedes tühikuid olla ei tohi
            //loo tabel nimega user. sulgudes väljad, mida tahame- nimi ja tüüp. auto-increment on parameeter, mis mõtleb ise järgmise numbri välja.
        //miskipärast on tava capslok.
            //pleintekstis ei TOHI krüpteerida paroole.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void registreeriKasutaja(String kasutajanimi, String sala) {
        //Regamine on pmõtselt uue rea lisamine tabelisse. insert.
        try {
            Statement stat = conn.createStatement();
            String sql ="INSERT INTO USER (USERNAME, PASSWORD) VALUES ('" + kasutajanimi + "', '"+ sala + "')";
                    //into on semivajalik, paljud baasid seda enam ei nõua
           //USER = tabel kuhu sisestan.
            //lisaks vaja öelda, mis feedidele andme sisestan ja mis väärtuse sistan
            //see komade ja plussidega jändamine on tegelt mitte kõige parem viis, suht veaohtlik, aga algajale käibküll
            stat.executeUpdate(sql);
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void kuvaRead(String kasutajanimi) {
        try {
            Statement stat = conn.createStatement();
            String sql ="SELECT * FROM USER WHERE USERNAME = '" + kasutajanimi +"'";
            //väljade välja küsimiseks on käsk SELECT. Kui panna tärn, küsib kõik
           //ütleme ka, kuskohast - from tabelist user
            //saab ka määrata, et ei taha kõiki tulemusi, vaid ainult selle kasutaja andmeid. selleks onkäsk WHERE
            ResultSet results = stat.executeQuery(sql);
//aga executeupdate nagu regkasutaja meetodis oli, enam ei toimi. st uuendamist, millegi muutmist
            //kui midagi väljaküsin,
            //resultset on eraldi OBJEKT, mis andmebaasi infot endas säilitaks
            //massiivi või arraylisti sarnane, aga toimib natsa teistmoodi.

            String abKasutaja = results.getString("USERNAME");
            //ütlen resultsetile, et tahan sellist stringi temalt kätte saada
            //kui on kümme kasutajat, siis tee seda sama asja tsükli sees. veits guugelda ka, paar asja tuleb juurde.
            System.out.println(abKasutaja);
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
