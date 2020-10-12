package section_20_lambda_function.application;

import section_20_lambda_function.entities.Product;
import section_20_lambda_function.util.CaixaAltaComFunction;
import section_20_lambda_function.util.SomaProdutoComDeterminadaLetra;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        SomaProdutoComDeterminadaLetra somaProdutoComDeterminadaLetra = new SomaProdutoComDeterminadaLetra();
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("AppleWatch", 1250.00));
        list.add(new Product("Zefone", 200.00));

        /**
         * .map() -> para transformação de dados, nesse caso a lógica está na Function criada.
         * .collect(Collectors.toList()) -> para transforma o retorno para nossa lista novamente.
         */
        List<String> nomes = list.stream().map(new CaixaAltaComFunction()).collect(Collectors.toList());

        nomes.forEach(System.out::println);

        // Fazer a soma dos produtos da list, tal que produto que leva o produto pegando o nome com a primeira letra XPTO
        Double soma = somaProdutoComDeterminadaLetra.somaProdutoT(list, product -> product.getName().charAt(0) == 'Z');

        System.out.println("Soma dos produtos começando com a letra T: " + String.format("%.2f", soma));


    }
}
