package metodos;

import java.util.Scanner;

public class Principal3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("hora: ");
        int hora = scanner.nextInt();

        System.out.println("minuto: ");
        int minuto = scanner.nextInt();

        System.out.println("add (min): ");
        int minutoAdd = scanner.nextInt();

        HoraEMinuto fusoBrasil = calcularHorario(hora, minuto, minutoAdd, 0, "Brasil");
        HoraEMinuto fusoMexico = calcularHorario(hora, minuto, minutoAdd, -3, "Mexico");
        HoraEMinuto fusoLondres = calcularHorario(hora, minuto, minutoAdd, 3, "Londres");

        fusoBrasil.imprimir();
        fusoMexico.imprimir();
        fusoLondres.imprimir();
    }

    private static HoraEMinuto calcularHorario(int hora, int minuto, int minutoAdd, int fuso, String fusoTxt) {
        // calcular a qtd de horas que vão ser adicionadas pelos minutos
        int horasParaAddNaHora = (minuto + minutoAdd) / 60;

        // somei tudo na hora e adicionei 24 para rodar o relogio e peguei o resto com 24
        int novaHora = (hora + fuso + horasParaAddNaHora + 24) % 24;

        // pegando os minutos dentro do intervalo de 0 a 59
        int novoMinuto = (minuto + minutoAdd) % 60;


        HoraEMinuto resultado = new HoraEMinuto();
        resultado.hora = novaHora;
        resultado.minuto = novoMinuto;
        resultado.fuso = fusoTxt;

        return resultado;
    }
}

class HoraEMinuto {
    int hora;
    int minuto;
    String fuso;

    public void imprimir() {
        System.out.println(hora+ " h " + minuto + " min " + "("+ fuso+")");
    }
}
