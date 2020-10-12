package section_20_lambda_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProgramaStream {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 3, 5, 7, 9);

        Stream<Integer> streamNumeros = numeros.stream().map(integer -> integer * 10);
        System.out.println(Arrays.toString(streamNumeros.toArray()));

        Stream<String> nomes = Stream.of("Itachi", "Minato", "Kakashi");
        System.out.println(Arrays.toString(nomes.toArray()));

        Stream<Integer> numerosInfinitos = Stream.iterate(1, integer -> integer * 5);
        System.out.println(Arrays.toString(numerosInfinitos.limit(5).toArray()));

        /**
         * Fibonacci
         */
        Stream<Long> fibonacci = Stream.iterate(new Long[]{0L, 1L}, interge -> new Long[]{interge[1], interge[0] + interge[1]}).map(longs -> longs[0]);
        System.out.println(Arrays.toString(fibonacci.limit(10).toArray()));

    }
}
