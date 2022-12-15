package repeticao;

public class Principal2 {

    public static void main(String[] args) {


        // EXERCICIO:
        // ESCREVA UM PROGRAMA PARA IMPRIMIR A TABUADA DE MULTIPLICACAO
        // DE 1 A 9

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
            System.out.println();
        }

    }
}
