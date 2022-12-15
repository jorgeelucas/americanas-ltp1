package vetores;

public class Principal {

    public static void main(String[] args) {

        // [2,3,4] = 3
        // [5,6,7,8] = 4

        int[] numeros;

        // [0,0,0]
        numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            int num = numeros[i];
            System.out.println(num);
        }

        //for-each
        for (int num : numeros) {
            System.out.println(num);
        }


        // ["Brasilia", "Bahia", "Sao paulo"]

        String[] estados = new String[3];

        estados[0] = "Brasilia";
        estados[1] = "Bahia";
        estados[2] = "Sao paulo";

        for (String estado : estados) {
            System.out.println(estado);
        }

        System.out.println("####");

        estados[0] = "Minas Gerais";

        for (String estado : estados) {
            System.out.println(estado);
        }


        System.out.println("####");


        // criei um array de pessoas
        Pessoa[] pessoas = new Pessoa[2];

        // criei uma pessoa
        var pessoa1 = new Pessoa();
        pessoa1.nome = "joao";

        // criei outra pessoa
        var pessoa2 = new Pessoa();
        pessoa2.nome = "maria";

        // adicionei as duas pessoas no array
        pessoas[0] = pessoa1;
        pessoas[1] = pessoa2;

        for (Pessoa x : pessoas) {
            System.out.println(x.nome);
        }
    }

}


class Pessoa {
    String nome;
}