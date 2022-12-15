package vetores;

public class Principal2 {

    public static void main(String[] args) {


        // [null, null]
        String[] nomes = new String[2];

        // tamanho
        int tamanho = nomes.length;


        String[] paises = {"França", "Argentina"};

        System.out.println(paises.length);

        int[] nums = {1,2,3,4,5};

        System.out.println(nums.length);

        System.out.println("####");


        // ['j', 'o', 'r', 'g', 'e']
        //   0    1    2    3    4


        char[] nome = "jorge".toCharArray();

        System.out.println(nome[2]);


        System.out.println("####");


        Boolean[] valores = new Boolean[3];

        for (Boolean valor : valores) {
            System.out.println(valor);
        }


        String frase = "meu relogio eh bonito";

        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.charAt(i));
        }

        char[] chars = frase.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }


    }


    public String deArrayParaString(char[] txt) {
        return new String(txt);
    }
}
