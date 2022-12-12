package condicionais;

public class Principal {
    public static void main(String[] args) {

        int marco = mesEmNumero("março");

        System.out.println(marco);


    }

    public static int isNumero(String letra) {
        return Character.isDigit(letra.charAt(0)) ? 1 : 0;
    }

    public static int mesEmNumero(String mes) {
        return switch (mes) {
            case "janeiro", "january", "enero"      -> 1;
            case "fevereiro"    -> 2;
            case "março"        -> 3;
            default             -> -1;
        };
    }

}