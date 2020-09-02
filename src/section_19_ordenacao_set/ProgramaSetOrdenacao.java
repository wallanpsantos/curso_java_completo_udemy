package section_19_ordenacao_set;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramaSetOrdenacao {
    public static <string> void main(String[] args) {

        /* HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado */
//        Set<String> set = new HashSet<>();

        /* TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo
        compareTo do objeto (ou Comparator) */
//        Set<String> set = new TreeSet<>();

        /* LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionado*/
        Set<String> set = new LinkedHashSet<>();

        set.add("Lapis");
        set.add("Borracha");
        set.add("Clips");
        set.add("Caneta");

        // Predicado para Remove palavras maiores ou igual a 8
        set.removeIf(z -> z.length() >= 8);



        for (String objeto : set) {
            System.out.println(objeto);
        }
    }
}
