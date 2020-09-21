package section_20_lambda_comparator_consumer.application;

import section_20_lambda_comparator_consumer.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("AppleWatch", 1250.00));
        list.add(new Product("Zefone", 200.00));

        list.sort(Comparator.comparing(product -> product.getName().toUpperCase()));

        // Ordenar
        for (Product p : list) {
            System.out.println(p);
        }

        double limite = 500.00;
        list.removeIf(product -> product.getPrice() >= limite);
        // Exibir valores
        System.out.println("\nProdutos com valores abaixo de " + limite);
        for (Product p : list) {
            System.out.println(p);
        }
    }
}
