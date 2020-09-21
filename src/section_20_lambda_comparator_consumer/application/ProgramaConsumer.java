package section_20_lambda_comparator_consumer.application;

import section_20_lambda_comparator_consumer.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ProgramaConsumer {
    public static void main(String[] args) {

        List<Product> listProduct = mockProdutos();

        // Upgrade nos valores com a interface Consumer<T>
        Consumer<Product> productConsumer = product -> product.setPrice(product.getPrice() + (product.getPrice() * 0.10));

        // forEach para Percorrer toda a lista de produtos e atualizar o preço
        // listProduct.forEach(productConsumer);

        // Percorrendo a lista de produtor para atualizar o preço
        for (int i = 0; i < listProduct.size(); i++) {
            productConsumer.accept(listProduct.get(i));
        }

        // Percorrendo lista de produtos para exibir o novos valores
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
