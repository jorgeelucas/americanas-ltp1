package vetores;

import java.util.List;
import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        String palindromo1 = "osso";
        String palindromo2 = "ovo";
        String palindromo3 = "socorram me subi no onibus em marrocos";

        // escreva um programa que leia uma frase/palavra
        // do usuário e informe se essa palavra
        // é palindromo ou não!

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a frase: ");
        String frase = scanner.nextLine();

        boolean isPalindromo = isPalindromo(frase);

        if (isPalindromo) {
            System.out.println("A frase informada eh um palindromo");
        } else {
            System.out.println("A frase informada NAO eh um palindromo");
        }

        char[] letras = {'a', 'b', 'c', 'd'};


        int ultimo = letras.length - 1;
        for (int i = 0; i < letras.length; i++) {
            char temp = letras[i];
            letras[i] = letras[ultimo];
            letras[ultimo] = temp;
            ultimo--;
        }

        System.out.println("Frase invertida: " + new String(letras));


    }

    public static boolean isPalindromoPedroH(String frase) {
        char[] txt = new char[frase.length()];
        txt = frase.toCharArray();

        for (int i = 0; i < txt.length; i++) {
            if (txt[i] != txt[txt.length - i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindromo(String txt) {
        System.out.println("Palavra original: " + txt);
        txt = txt.replace(" ", "");

        System.out.println("Palavra sem espaco: " + txt);
        char[] chars = txt.toCharArray();

        int ultimo = chars.length - 1;
        System.out.println("Ultima posicao: " + ultimo);

        for (int i = 0; i < chars.length / 2; i++) {
            System.out.println("comparar: " + chars[i] + " = " + chars[ultimo] + "?");
            if (chars[i] != chars[ultimo]) {
                return false;
            }
            ultimo--;
        }
        return true;
    }
}
