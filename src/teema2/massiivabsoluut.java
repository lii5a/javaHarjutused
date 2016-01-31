package teema2;

/**
 Koostage Java-meetod, mis leiab etteantud massiivi m elementide absoluutväärtuste summa.
 Write a method in Java to find the sum of absolute values of elements of a given array m. */

//õige!!!
public class massiivabsoluut {


        public static void main (String[] args) {

            System.out.println (absvSumma (new int[]{2,-3}));
            // YOUR TESTS HERE
        }

        public static int absvSumma (int[] m) {
            int sum = 0;
            for (int i = 0; i < m.length; i++) {
                sum = sum + Math.abs(m[i]);
            }
            return sum;  // YOUR PROGRAM HERE
        }




}
