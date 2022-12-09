package metodos;

import java.util.Scanner;

public class Principal {

    public static void main(String [] args) {

        Scanner ler = new Scanner(System.in);

        int resultado = somarNumeros("informe o numero: ", ler);

        System.out.println("Resultado: "+resultado);

    }


    public static int somarNumeros(String mensagem, Scanner ler) {
        System.out.println(mensagem);
        int primeiro = ler.nextInt();

        System.out.println(mensagem);
        int segundo = ler.nextInt();

        return primeiro + segundo;
    }

    // [modificador]: public, protected e private
    // [tipo retorno]: int, long, Pessoa, Integer
    // nome         : somarTresNumeros
    // ()/(tipo nome) : somarTresNumeros(int numeroUm, int numero2, int numero3)
    // {}

}