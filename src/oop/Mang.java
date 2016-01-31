package oop;

/**
 *mere (laua) ja laevastiku genereerimine
 * mängu loogika: kuni laevu on elus
    * küsi kasutajalt koordinaadid
    * pommita merd
     * anna tagasisidet
 * mäng on läbi
 */
public class Mang {

    public Mang(){ //see on konstruktor. täpselt sama nimega, mis klass.
        System.out.println("start mäng");
        Meri meri = new Meri(3); //ütleme kaasa, et ole 10 ühikut pikk ja lai
        Mangija mangija = new Mangija();

        while (meri.kasOnLaevuPinnal()) {
            meri.kuvaSeis();
            int[] lask = mangija.kysiLasuKoordinaadid(); //ilmnevad kasutaja sisestatud koordinaadid, nimetame selle lasu massiiviks
            boolean pihtas = meri.kasKeegiSaiPihta(lask);
            if (pihtas) {
                mangija.pihtas();
            } else {
                mangija.moodas();
            }
        }
        mangija.gameover();

    }
}
