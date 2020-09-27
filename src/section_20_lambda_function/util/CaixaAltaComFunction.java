package section_20_lambda_function.util;

import section_20_lambda_function.entities.Product;

import java.util.function.Function;

/**
 * Function tem dois tipos T para entrada R para saída.
 * <p>
 * A função "map" serve para aplicar uma função a todos os elementos de uma stream
 */
public class CaixaAltaComFunction implements Function<Product, String> {

    @Override
    public String apply(Product product) {

        return product.getName().toUpperCase();
    }


}
