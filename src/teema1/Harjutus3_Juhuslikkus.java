package teema1;

import java.util.Scanner;

/**
 * Juhuslikkus
 *
 * 1. Kirjutada mäng kull ja kiri.
 *    Programm küsib kasutajalt: kas kull või kiri? "Viskab" mündi ja
 *    teatab, kas kasutaja arvas õigesti või mitte.
 *    Vihje: ära hakka jändama Stringidega, küsi kasutajalt number.
 *
 * 2. Kirjutada liisu tõmbamise programm.
 *    Küsida kasutajalt inimeste arv. Väljastada juhuslik number vahemikus 1
 *    kuni arv (kaasaarvatud).
 *    NB! Kontrollida, et töötab õigesti: st. öeldes mitu korda järjest
 *    arvuks 3, peab võimalike vastuste hulgas olema nii ühtesid, kahtesid kui kolmi.
 *
 * 3. Kirjutada täringumäng:
 *    Programm viskab kaks täringut mängijale ja kaks täringut endale
 *    (arvutile), arvutab mõlema mängija silmade summad ja teatab,
 *    kellel oli rohkem.
 */
public class Harjutus3_Juhuslikkus {
    public static void main(String[] args) {

        //kull ja kiri

            System.out.println("kull või kiri? kui kull, ütle 0. kui kiri, ütle 1.");
            Scanner juhu = new Scanner(System.in);
            double sisestus = juhu.nextDouble();

            double mynt=(int)(Math.random()*2);
            System.out.println(mynt);

            if(sisestus==mynt){
                System.out.println("õige!");
            }
            else {
                System.out.println("vale!");
            }

        //liisu tõmbamine

        System.out.println();

        System.out.println("A palju inimesi on?");
        Scanner inimestearv = new Scanner(System.in);
         int hulk = inimestearv.nextInt();

        int liisk = (int)(1+ Math.random()*hulk);
        System.out.println(liisk);
            System.out.println();
            System.out.println();


        /*    Programm viskab kaks täringut mängijale ja kaks täringut endale
    *    (arvutile), arvutab mõlema mängija silmade summad ja teatab,
            *    kellel oli rohkem.*/

        int taring1 = (int)(1+ Math.random()*6);
        int taring2 = (int)(1+ Math.random()*6);
        int taring3 = (int)(1+ Math.random()*6);
        int taring4 = (int)(1+ Math.random()*6);

        System.out.println("mina sain " + taring1 + " ja " + taring2);
        System.out.println("sina said " + taring3 + " ja " + taring4);

        if (taring1+taring2 > taring3+taring4) {
                System.out.println("Mina võitsin!");
        }
            else if ((taring1+taring2)==(taring3+taring4)){
                System.out.println("Viik!");
        }
            else {
                System.out.println("Sina võitsid!");
        }


        }

}
