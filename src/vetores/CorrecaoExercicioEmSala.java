package vetores;

import java.util.Scanner;

public class CorrecaoExercicioEmSala {
    public static void main(String[] args) {

        /**
         * Supondo que a população do país "A" seja de 80_000 habitantes,
         * com uma taxa anual de crescimento de 3%. E que a população de B seja 200_000 habitantes,
         * com uma taxa de crescimento de 1.5%.
         *     Faça um programa que calcule e escreva o número de anos necessários para que
         *     a população do país A ultrapasse ou iguale a população do país B
         *     mantidas as taxas de crescimento.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("informe a populacao do pais A: ");
        int populacaoPaisA = scanner.nextInt();

        System.out.print("informe a taxa de crescimento anual do pais A: ");
        double taxaCrescimentoPaisA = scanner.nextDouble();

        System.out.print("informe a populacao do pais B: ");
        int populacaoPaisB = scanner.nextInt();


        System.out.print("informe a taxa de crescimento anual do pais B: ");
        double taxaCrescimentoPaisB = scanner.nextDouble();

        int anos = 0;

        while (populacaoPaisA < populacaoPaisB) {
            anos++;

            double qtdCrescimentoPopulacaoA = populacaoPaisA * (taxaCrescimentoPaisA / 100);
            populacaoPaisA += qtdCrescimentoPopulacaoA;

            double qtdCrescimentoPopulacaoB = populacaoPaisB * (taxaCrescimentoPaisB / 100);
            populacaoPaisB += qtdCrescimentoPopulacaoB;
        }

        System.out.println("Anos: " + anos);
        System.out.println("Pop. A:" + populacaoPaisA);
        System.out.println("Pop. B:" + populacaoPaisB);


    }
}
