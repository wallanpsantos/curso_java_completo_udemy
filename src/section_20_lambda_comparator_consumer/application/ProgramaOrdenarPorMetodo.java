package section_20_lambda_comparator_consumer.application;

import section_20_lambda_comparator_consumer.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ProgramaOrdenarPorMetodo {

    public static void main(String[] args) {

        List<Product> listProduct = mockProdutos();

        // Ordenar por nome
        listProduct.sort(Comparator.comparing(product -> product.getName().toUpperCase()));

        // Filtrar por valor
        listProduct.removeIf(product -> product.getPrice() <= 1000);

        for (Product product : listProduct) {
            System.out.println(product);
        }
    }

    private static List<Product> mockProdutos() {

        List<Product> listaProduct = new ArrayList<>();

        listaProduct.add(new Product("TV", 100.00));
        listaProduct.add(new Product("Notebook", 1200.00));
        listaProduct.add(new Product("Tablet", 450.00));
        listaProduct.add(new Product("AppleWatch", 1250.00));
        listaProduct.add(new Product("Zefone", 200.00));

        return listaProduct;
    }
}
