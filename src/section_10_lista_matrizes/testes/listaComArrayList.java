package section_10_lista_matrizes.testes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listaComArrayList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Wallan");
        nomes.add("Flavia");
        nomes.add("Ana");

        /**
         * Remover nome com um determinado caracter
         */
        System.out.println("===================================");
        nomes.removeIf(nome -> nome.charAt(0) == 'W');
        for (String nome : nomes) {
            System.out.println(nome);
        }

        /**
         *  Filtra lista para que mostre nomes com determinado caracter
         */
        System.out.println("===================================");
        List<String> listaDeNomes = nomes.stream()
                .filter(n -> n.substring(0, 3).contains("a")).collect(Collectors.toList());
        System.out.println(listaDeNomes);


    }
}
