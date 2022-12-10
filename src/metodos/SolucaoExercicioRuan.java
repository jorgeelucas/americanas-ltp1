package metodos;

import java.util.Scanner;

public class SolucaoExercicioRuan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("hora: ");
        int hora = scanner.nextInt();

        System.out.println("minuto: ");
        int minuto = scanner.nextInt();

        System.out.println("add (min): ");
        int minutoAdd = scanner.nextInt();


        System.out.println("Brasil, " + horario(hora, minuto, minutoAdd, 0));
        System.out.println("Mexico, " + horario(hora, minuto, minutoAdd, -3));
        System.out.println("Londres, " + horario(hora, minuto, minutoAdd, 3));

    }

    public static String horario(int hora, int minuto, int addMinuto, int fuso) {
        int horasParaAdd = definirHorarioParaAdicionar(addMinuto);
        int minutosParaAdd = definirMinutoParaAdicionar(addMinuto);
        return horaLimitada(hora+fuso+horasParaAdd) + " h " + minuto + minutosParaAdd + " min";
    }

    public static int horaLimitada(int hora) {
        return (hora + 24) % 24;
    }

    private static int definirMinutoParaAdicionar(int addMinuto) {
        return addMinuto % 60;
    }

    public static int definirHorarioParaAdicionar(int minutos) {
        return minutos / 60;
    }
}

