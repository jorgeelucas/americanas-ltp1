package matrizes;

public class Exercicio {

    public static void main(String[] args) {

        // String == "";
        // char == ''

        Character[][] mat = new Character[3][3];
        mat[0][0] = 'X';

        imprimir(mat);

        mover(mat);
        mover(mat);
        mover(mat);

        // [1,2]

        // [_, _, _]
        // [X, _, _]
        // [_, _, _]
    }

    public static void imprimir(Character[][] mat) {
        System.out.println();

        for (int indiceLinha = 0 ; indiceLinha < mat.length ; indiceLinha++) {
            Character[] linha = mat[indiceLinha];
            System.out.print("[ ");

            for (int indiceColuna = 0 ; indiceColuna < mat[indiceLinha].length ; indiceColuna++) {
                Character elemento = mat[indiceLinha][indiceColuna];

                if (elemento == null) {
                    System.out.print("_");
                } else {
                    System.out.print(elemento);
                }

                int ultimaPosicaoColuna = linha.length - 1;

                if (indiceColuna == ultimaPosicaoColuna) {
                    System.out.print(" ]");
                } else {
                    System.out.print(" , ");
                }
            }
            System.out.println();
        }
    }

    public static void mover(Character[][] mat) {
        encontrar(mat);

        int[] posicao = encontrar(mat);

        int linha = posicao[0];
        int coluna = posicao[1];

        Character elemento = mat[posicao[0]][posicao[1]];
    }

    public static int[] encontrar(Character[][] mat) {
        int[] posicoes = new int[2];
        posicoes[0] = 0;
        posicoes[1] = 0;

        return posicoes;
    }

    private static void moverParaBaixoEComeco(Character[][] mat) {
    }
}
