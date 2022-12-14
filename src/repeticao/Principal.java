package repeticao;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        /**
         * Exercício
         *
         * 1. Faça um programa que leia 5 números e informe o maior número.
         *
         * 2. Faça um programa que receba dois números inteiros e
         *      gere os números inteiros que estão no
         *      intervalo compreendido por eles.
         *
         */

        Scanner scanner = new Scanner(System.in);

        int numero, aux = 0;

        for (int i = 0; i < 5; i++) {
            System.out.printf("informe %do numero: ", (i+1));
            numero = scanner.nextInt();

            if (numero > aux) {
                aux = numero;
            }
        }

        System.out.println("maior numero digitado foi: " + aux);

    }

}
