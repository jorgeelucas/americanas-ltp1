package vetores;

import java.util.Scanner;

public class CorrecaoExercicio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o investimento inicial: ");
        double incial = scanner.nextDouble();

        System.out.print("Informe o investimento mensal: " );
        double mensal = scanner.nextDouble();

        System.out.print("Informe a porcentagem do rendimento mensal: ");
        double rendimento = scanner.nextDouble();

        System.out.print("Informe quanto é o seu objetivo: ");
        double objetivo = scanner.nextDouble();

        exercicioInvestimento(incial, mensal, rendimento, objetivo);
    }

    public static void exercicioInvestimento(double investimentoInicial, double investimentoMensal, double porcentagemRendimentoMensal, double objetivo) {

        double saldo = investimentoInicial;
        int meses = 1;

        while (saldo <= objetivo) {
            double rendimento = (saldo) * (porcentagemRendimentoMensal / 100);
            saldo += rendimento;
            saldo += investimentoMensal;
            meses++;
        }

        System.out.println("Serão necessários " + meses + " meses para atingir " + objetivo);
        System.out.printf("Saldo: %.2f\n", saldo);

    }

    public static void exercicioPopulacoesPaises() {
        int populacaoA = 80_000;
        double taxaCrescimentoPopulacaoA = 30;

        int populacaoB = 200_000;
        double taxaCrescimentoPopulacaoB = 15;


        int anos = 0;

        while (populacaoA <= populacaoB) {
            populacaoA += populacaoA * (taxaCrescimentoPopulacaoA / 100);
            populacaoB += populacaoB * (taxaCrescimentoPopulacaoB / 100);
            anos++;
        }

        System.out.println();
        System.out.println("Em " + anos + " anos a população do pais A seria maior que a população do pais B");
        System.out.println("Pais A: " + populacaoA);
        System.out.println("Pais B: " + populacaoB);
    }
}
