package KT2;
/*
Koostage Java meetod, mis genereerib parameetrina etteantud n järgi niisuguse n korda n täisarvumaatriksi,
 mille iga elemendi väärtuseks on selle elemendi reaindeksi ja veeruindeksi korrutis (indeksid algavad nullist).
 Write a method in Java to generate an integer matrix of size n x n (n is a parameter of the method) elements
 of which are calculated by multiplying the row index and the column index of the element (indices start from zero). */

import java.util.Arrays;

public class KT2yks {

    public static void main (String[] args) {
        int[][] res = korraTabel (9);
       // System.out.println("katse, kas töötab. positsioon kolm kaks" +res[3][2]);
    }

    private static int[][] korraTabel (int n) {

        int[][] maatriks = new int[n][n];

        for (int rida = 0; rida < maatriks.length ; rida++) { //lengthi asemel võiks n ka olla

            for (int veerg = 0; veerg < maatriks[rida].length ; veerg++) { //lengthi võiks lihtsalt enniga asendada ka
                maatriks[rida][veerg] = rida*veerg;
               System.out.print(maatriks[rida][veerg] + "\t");
            }
            System.out.println();

        }
        return maatriks;
    }

}

