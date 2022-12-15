package matrizes;

import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        // matrizes - array multidimensional

        int[][] inteiros = new int[5][5];


        // com for-each
        for (int[] array : inteiros) {
            for (int elemento : array) {
                System.out.print(elemento+ " ");
            }
            System.out.println();
        }

        // com for-i
        for (int linha = 0 ; linha < inteiros.length ; linha++) {

            for (int posicao = 0 ; posicao < inteiros[linha].length ; posicao++) {

                int elemento = inteiros[linha][posicao];

                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        //  [ [1,2,3], [1,2,3], [1,2,3] , [1,2,3] ]

        // array.length = 4
        // array[0].length = 3

    }

}

