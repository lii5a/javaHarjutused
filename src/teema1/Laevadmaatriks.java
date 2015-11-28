package teema1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lii5a on 17/11/15.
 */
public class Laevadmaatriks {
    static int[][] laud; //defineerin siin, et ta ei jääks alla meetodisse kinni. ei ütle, mis ta sees on. lihtsalt ütlen, et on klassi küljes olemas. uau! isegi väljapoole main meetodit!
    //peab ütlema static sellepärast, et kõik meetodid on static.
    static int lauaLaius = 3; //selleks, et ei peaks igal pool for tsüklites nt laua pikkust-kõrgust muutma hakata.
    static int lauaKorgus = 3;



    public static void main(String[] args) {

        //while (kasonveellaevu()) {
            genereerilaud();
            laevagenereerimine();
            int[] xy = kysilaevakohta(); //ütlen, et muutuja xy saab siit meetodist kätte. võtan vastu siin.
            kontrollitabamust(xy); //võtsin sellesama laeva asukoha kysilaevakohta meetodist kaasa
            kasonveellaevu(laud);
       // System.out.println();
       // System.out.println();
      //   }
       // System.out.println("MÄNG LÄBI!");
        
    }

    private static void kasonveellaevu(int laud[][]) { //meetod, kuhu saab sisestada mingi kahedim array hekseldamiseks



        for (int rida = 0; rida<laud.length; rida++) { //tsükkel, mis käib rea läbi nii palju, kui kontrollil ridu on.
            for (int veerg = 0; veerg <laud[rida].length; veerg++) { //NB! äge trikk! hekseldab veergu nii pikalt kui on iga kontrolli rida
                System.out.print(laud[rida][veerg] + " ");

                //siin tahaks öelda, et kui siin massiivis enam ühtegi ühte ei ole, on gameover

                }
            System.out.println();
            }

        }

    private static void kontrollitabamust(int[] xy) { //xy sellepärast, et võtame siin vastu kysilaevakohta meetodist massiivi xy
        int x = xy[0]; //võtan välja x ja y koordinadid xy massiivist
        int y = xy[1];
        int siht = laud[y][x];
        //teame peast, et x oli 0-positsioonil ja y 1-positsioonil. wtf.
        if (siht == 1) {
            System.out.println("pihtas!");
            laud[x][y] = 2;
        } else if (siht == 0) {
            System.out.println("mööda");

        }
        else if (siht ==2) {
            System.out.println("seda sa juba pakkusid, paku midagi uut!");
        }
    }

    private static int[] kysilaevakohta() { //voidi asemele kirjutasin int[], et palun luba intide massiivi tagastamine. voh.
         Scanner kysimus = new Scanner(System.in);

        try {               //kindlustame errori eest. võta kood blokki ja code-menüüst surround with.
            System.out.println("Arva, kus on laev. Ütle rea number.");
            int x = kysimus.nextInt()-1;
            System.out.println("Nyyd ytle veeru number");
            int y = kysimus.nextInt()-1;
            int[] xy = {x, y}; //teen uue massiivi nimega xy ja salvestan kasutajalt saadud kraami massiivi sisse
            return xy; //tagasta massiiv xy
            //nood ülemised kaks rida on seganekoht.
        } catch (Exception e) { //võtame vastu exception muutuja.kui on try peab olema ka catch. throw new exceptioniga saab ise välja kutsuda.
            //e.printStackTrace(); //see tuli automaatselt kaasa
            System.out.println("number tuleb ikka sisestada!");
        }
        return kysilaevakohta(); //kui midagi läeb pekki, siis käivitab siin kysilaevakohta uuesti

    }

    private static void laevagenereerimine() {
        for (int i = 0; i < lauaKorgus; i++) {
            for (int j = 0; j < lauaLaius ; j++) {
                laud[i][j] = (int)(Math.random()*2);
            }
            System.out.println(Arrays.toString(laud[i]));


        }

    }

    private static void genereerilaud() {
          laud = new int[lauaKorgus][lauaLaius]; //laua ees pole inti vms. saab aru, et pole uut vaja, vaid võta see, mis klassi küljes juba defineeritud.
   //korgus enne kui laius seepärast, et see on konteinermassiiv.
    }

}

