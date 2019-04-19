package matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        int array[][] = {{2, 3, -4}, {2, 3, 4}, {-2, 3, 4}};
        int diag1 = 0;
        int diag2 = 0;

        Diagonal p = new Diagonal(diag1, diag2);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if ((i - j) == 0) {
                    p.diag1 += array[i][j];
                }
                if ((i + j) == (array.length - 1)) {
                    p.diag2 += array[i][j];

                }
            }

        }

        System.out.println("Valor Absoluto: " + (Math.abs(p.diag1 - p.diag2)));

    }
}
