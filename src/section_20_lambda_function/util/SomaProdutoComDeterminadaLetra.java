package section_20_lambda_function.util;

import section_20_lambda_function.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class SomaProdutoComDeterminadaLetra {

    /**
     * Metodo para calcular a soma de um produto,
     * com base na primeira letra passada no criterio de aceite
     *
     * @param listaProduto
     * @param criterio
     * @return
     */
    public Double somaProdutoT(List<Product> listaProduto, Predicate<Product> criterio) {

        Double soma = 0.0;
        for (Product product : listaProduto) {
            if (criterio.test(product)) {
                soma += product.getPrice();
            }
        }
        return soma;
    }
}
