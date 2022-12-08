import java.util.Scanner;

public class Main {
    public static void main(String[] argumentos) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a hora: ");
        int hora = teclado.nextInt();

        System.out.print("Informe a minuto: ");
        int minuto = teclado.nextInt();

        System.out.print("quandidade adicionar: ");
        int add = teclado.nextInt();

        hora = hora+add;

        System.out.println("Brasil, " + hora % 24 + "h" + minuto+"min");
        System.out.println("Mexico, " + ((hora - 3) + 24) % 24 + "h" + minuto+"min");
        System.out.println("Londres, " + ((hora + 3) + 24) % 24 + "h" + minuto+"min");
        // comentario git

    }
}





