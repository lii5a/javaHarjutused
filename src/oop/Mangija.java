package oop;

import java.util.Scanner;

/**
 * Created by lii5a on 29/12/15.
 */
public class Mangija {

    private Scanner sc = new Scanner(System.in);

    public int[] kysiLasuKoordinaadid() {
        System.out.println("Palun sisesta lasu koordinaadid formaadis xxx-yyy");
        String[] sisestus = sc.nextLine().split("-");
        int x = Integer.parseInt(sisestus[0]);
        int y = Integer.parseInt(sisestus[1]);
        return new int[]{x, y};
    }

    public void pihtas() {
        System.out.println("said pihta");
    }

    public void moodas() {
        System.out.println("läks mööda");
    }

    public void gameover() {
        System.out.println("gameover");

    }
}
