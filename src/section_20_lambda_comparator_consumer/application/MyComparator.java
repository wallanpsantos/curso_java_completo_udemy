package section_20_lambda_comparator_consumer.application;

import section_20_lambda_comparator_consumer.entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    // Criando comparator utilizando Java 6 e 7
    @Override
    public int compare(Product product, Product t1) {
        return product.getName().toUpperCase().compareTo(t1.getName().toUpperCase());
    }
}
