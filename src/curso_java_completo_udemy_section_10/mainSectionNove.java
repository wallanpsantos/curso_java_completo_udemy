/**
 *
 */
package curso_java_completo_udemy_section_10;

import curso_java_completo_udemy_section_10.entities.Produto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author wallan
 *
 */
public class mainSectionNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();

        Produto[] listaProduto = new Produto[n];

        for (int i = 0; i < listaProduto.length; i++) {
            scanner.nextLine();
            String nome = scanner.nextLine();
            Double preco = scanner.nextDouble();
            listaProduto[i] = new Produto(nome, preco);
        }

        /* Média */
        double soma = 0.0;
        for (int i = 0; i < listaProduto.length; i++) {
            soma += listaProduto[i].getPreco();
        }
        double media = soma / listaProduto.length;

        System.out.println(Arrays.asList("Média dos produtos: " + media));
        scanner.close();
    }
}
