package section_20_lambda_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramaStreamPipeline {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /**
         * Multiplicacao com stream() e map()
         */
        Stream<Integer> multiplicacao = numeros.stream().map(integer -> integer * 10);
        System.out.println(Arrays.toString(multiplicacao.toArray()));

        /**
         * Soma com stream() e reduce()
         */
        Integer soma = numeros.stream().reduce(0, (integer, integer2) -> integer + integer2);
        System.out.println("Soma: " + soma);

        /**
         * Nova lista com numeros pares ou seja o resto é igual a zero
         */
        List<Integer> novosNumeros = numeros.stream().filter(integer -> integer % 2 == 0).map(integer -> integer * 10).collect(Collectors.toList());
        System.out.println("Números pares: " + novosNumeros);




    }
}
