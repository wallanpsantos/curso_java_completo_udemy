package section_19_curingas_delimitados;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramaCuringaDelimitado {

    public static void main(String[] args) {

        List<Integer> numerosInteiros = Arrays.asList(0, 1, 2, 3, 4);

        List<Double> numerosDouble = Arrays.asList(3.14, 6.28);

        List<Object> listaObjeto = new ArrayList<>();

        copy(numerosInteiros, listaObjeto);
        exibirListaNova(listaObjeto);

        copy(numerosDouble, listaObjeto);
        exibirListaNova(listaObjeto);

    }

    // Variancia segue arvore abaixo do Numbers
    // Contravariancia pode ser Number ou Object, ou seja, sobe ou desce na arvore
    private static void copy(List<? extends Number> variancia, List<? super Number> contraVariancia) {
        contraVariancia.addAll(variancia);
    }

    // Chamando nossa lista de objetos copiado
    public static void exibirListaNova(List<?> lista) {
        for (Object obj : lista) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
