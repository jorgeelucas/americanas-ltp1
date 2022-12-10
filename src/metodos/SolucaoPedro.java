package metodos;

import java.util.Scanner;

public class SolucaoPedro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("hora: ");
        int hora = scanner.nextInt();

        System.out.println("minuto: ");
        int minuto = scanner.nextInt();

        System.out.println("add (min): ");
        int minutoAdd = scanner.nextInt();

        addMinuto(hora, minuto, minutoAdd);
    }

    public static void addMinuto(int hora, int minuto, int minAdd) {
        int minutoRestante = (minuto + minAdd) % 60;
        int horaAdicionada = (hora + (minuto + minAdd) / 60);
        fusoHorario(horaAdicionada, minutoRestante);
    }

    private static void fusoHorario(int hora, int minuto) {
        System.out.printf("Brasil: %dh%dmin\n", hora % 24, minuto);
        System.out.printf("Mexico: %dh%dmin\n" , ((hora - 3) +24) % 24, minuto);
        System.out.printf("londres: %dh%dmin\n", ((hora + 3) +24) % 24, minuto);
    }
}
