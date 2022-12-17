package exceptions;

import java.text.Normalizer;

public class Principal2 {

    static int[] numeros = {1,2,3};

    public static void main(String[] args) {

        String nome = null;

        String nomeFormatado = formatar(nome);

        System.out.println(nomeFormatado);

    }

    public static int buscaElementoNaPosicao(int posicao) {
        if (posicao > 0 && posicao < numeros.length) {
            return numeros[posicao];
        } else {
            return -1;
        }
    }


    public static String formatar(String str) {
        str = removerAcentos(str);
        str = removerPontuacao(str);
        str = removerEspacos(str);
        return str.toLowerCase();
    }

    public static String removerAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

    public static String removerPontuacao(String str) {
        return str.replaceAll("\\p{Punct}", "");
    }

    public static String removerEspacos(String str) {
        return str.replace(" ", "");
    }



}
