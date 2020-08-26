package section_19_tipo_coringa;

import java.util.Arrays;
import java.util.List;

public class ProgramaCoringa {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(5, 10, 15);
        exibirNumero(numeros);

        System.out.println("=============");

        List<String> nomes = Arrays.asList("Zezino", "Ana", "Bob");
        exibirNumero(nomes);
    }

    // ? Coringa ele identifica o tipo de lista que está sendo passado
    /* !! Porem não podemos instancia um tipo coringa e adicionar dados exemplo: obj.add(xyz); */
    private static void exibirNumero(List<?> lista) {

        // Utilize o Object por causa do coringa
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }
}
