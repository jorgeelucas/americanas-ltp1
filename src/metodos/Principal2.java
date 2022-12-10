package metodos;

import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        var ler = new Scanner(System.in);

        System.out.println("primeiro numero: ");
        int a = ler.nextInt();


        System.out.println("segundo numero: ");
        int b = ler.nextInt();

        System.out.println("resultado soma: " + somar(a, b));
        System.out.println("resultado mult: " + multimplicar(a, b));
        System.out.println("resultado divi: " + dividir(a, b));
        System.out.println("resultado subt: " + subtrair(a, b));

    }

    public static int somar(int a, int b) {
        return a+b;
    }

    public static long somar(long a, long b) {
        return a + b;
    }

    public static int multimplicar(int a, int b) {
        return a*b;
    }

    public static int dividir(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a/b;
    }

    public static int subtrair(int a, int b) {
        return a-b;
    }
}
