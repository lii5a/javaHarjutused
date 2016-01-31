package oop;

/**
 * mein klassis muud ei teegi kui kutsun teisi klasse välja, iga asi omal kohal
 * ainult main klassis on main meetod, mujal pole ja neid käivitada ei saa
 */
public class Main {
    public static void main(String[] args) {
        new Mang();
    }
}

/*
* Main
    * oskab mängu käivitada
* Mäng ise
*   oskab mängu seadistada
*   oskab mängu töös hoida
*   oskab mängu lõpetada

*   Mängija
*   oskab küsida lasu koordinaate
*   oskab tagasisidet anda, kui lask läks pihta
*   oskab tagasisidet anda, kui lask läks mööda
*   oskab tagasisidet anda, kui mäng on läbi

* esiteks laev:
    * teab, kus ta asukoht on, teab oma koordinaate
    * teab, kas ta on pinnal või põhjas
    * oskab pihta saada
    * oskab ennast näidata
    * oskab endale koordinaadid määrata
    * ideeliselt oskab teise laevaga põrkumist kontrollida - täna ei tee
    * oskab öelda, kas on põhjas või mitte


(teab on muutuja, oskab on meetod)

*teiseks meri (teeb kõik asjad, mida grupi laevadega vaja teha on, nt küsib kõikidelt laevadelt, kas kseegi sai pihta))
        meri suhtleb iga laevaga, kamandab neid.
        *  teab laevu
        * oskab luua laevastiku
        * oskab koordineerida laevade põhja laskmist
        * oskab kontrollida elavaid laevu - kas mäng on läbi või mitte
         * meri näitab ka mängu seisu, prindib välja laua
 */