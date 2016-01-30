package KT2;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lii5a on 14/01/16.
 *Koostada Java meetod, mis asendab parameetrina etteantud sõnes s kõik väiketähed märgiga '-'.
 Lahendus peab kasutama tsüklit.
 Write a Java method to replace all lowercase letters in a given string s by symbol '-'.
 The solution must use a loop.
 */
public class kaks {

    public static void main(String[] args) {
        String s = "Tere, TUDENG, tore ARVUTI sul!";
        String t = asenda(s); // "T---, TUDENG, ---- ARVUTI ---!"
        System.out.println(s + " > " + t);
        //System.out.println(asenda(s));
    }

    public static String asenda(String s) {

        char[] tahemassiiv = s.toCharArray();

      for (int i = 0; i <tahemassiiv.length; i++) {

          if (Character.isLowerCase(tahemassiiv[i])){
              tahemassiiv[i]='-';
            }

        }
        asdfasdfSystem.out.println(tahemassiiv);
        String uus= String.valueOf(tahemassiiv);
        //System.out.println("uus on" +uus);
        return  uus;
    }


}




