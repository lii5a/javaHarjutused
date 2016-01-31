package teema1;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lii5a on 05/11/15.
 */

public class Laevad_ise {
    public static void main(String[] args) {
        int[] laud = {randLaev(),randLaev(),randLaev(),randLaev(),randLaev(),randLaev(),randLaev(),randLaev(),randLaev(),randLaev(), };
        System.out.println(Arrays.toString(laud));
        Scanner kasutaja = new Scanner(System.in);

        while (gameover(laud)) {
            System.out.println("Sisesta üks number ja arva, kus laev on");
            int sisestus = kasutaja.nextInt();

            if (laud[sisestus] == 1) {
                System.out.println("PIHTAS PÕHJAS!");
                laud[sisestus] = 2;
                System.out.println(Arrays.toString(laud));
            } else if (laud[sisestus] == 2) {
                System.out.println("juba arvasid, et seal on ja oligi, mis nüüd enam!");
            } else if (laud[sisestus] == 0) {
                System.out.println("mööda");
            }
        }
        System.out.println("GAME OVER!");
    }
    public static boolean gameover(int[] laud) { //väljund on boolean, nimi on gameover, väljund on intide massiiv nimega laud. static peab olema sellepärast, et peameetod on static. väljakutsutav meetod peab ka olema siis static.
        for (int i = 0; i < laud.length; i++) {
            if(laud[i]==1) {
                return true;
            }
        }
        return false;
    }
    public static int randLaev(){
        return (int) (Math.random() * 2); //korrutan kahega, et oleks 0-1,99 ja int, et poleks komakohaga arv, s.o casting
    }
}
// video jäi pooleli 1:26
// https://echo360.e-ope.ee/ess/echo/presentation/5490fe3d-5a31-4912-af99-51bb58129db8