package vetores;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.text.Normalizer;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static vetores.Palindromo.*;

public class PalindromoTest {

    public static final String FILE_PATH = "/Users/jorge/Study/letscode/americanas/americanas-ltp1/palindromos.txt";

    public static void main(String[] args) throws IOException {

        Path path = Paths.get(FILE_PATH);

        List<String> palavras = Files.readAllLines(path);

        palavras.stream().collect(Collectors.toMap(Function.identity(), PalindromoTest::formatar))
                .entrySet()
                .stream()
                .map(entry -> isPalindromo(entry.getValue()) ? "✅ : " + entry.getKey() : "❌ : " + entry.getKey())
                .forEach(System.out::println);
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
