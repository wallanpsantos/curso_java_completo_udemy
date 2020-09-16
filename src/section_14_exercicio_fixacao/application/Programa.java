package section_14_exercicio_fixacao.application;

import section_14_exercicio_fixacao.entities.Produto;
import section_14_exercicio_fixacao.entities.ProdutoImportado;
import section_14_exercicio_fixacao.entities.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite qtd de produto: ");
        Integer qtdProduto = scanner.nextInt();

        List<Produto> listaProduto = new ArrayList<>();

        for (int i = 1; i <= qtdProduto; i++) {
            System.out.println("Produto #" + i);
            System.out.println("Novo, Usado ou importado (N,U,I) ?");
            char character = scanner.next().charAt(0);

            System.out.println("Nome produto: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.println("Preço produto: ");
            double preco = scanner.nextDouble();

            if ("I".equalsIgnoreCase(String.valueOf(character))) {
                System.out.println("Digite valor da taxa: ");
                Double valorTaxa = scanner.nextDouble();
                listaProduto.add(new ProdutoImportado(nome, preco, valorTaxa));
            }

            if ("N".equalsIgnoreCase(String.valueOf(character))) {
                listaProduto.add(new Produto(nome, preco));
            }

            if ("U".equalsIgnoreCase(String.valueOf(character))) {
                System.out.println("Entre com data (dd/mm/aaaa): ");
                Date data = simpleDateFormat.parse(scanner.next());
                listaProduto.add(new ProdutoUsado(nome, preco, data));
            }
        }

        System.out.println("\n Etiquetas de precos ");
        for (Produto produto : listaProduto) {
            System.out.println(" " + produto.etiquetaPreco());
        }
    }
}
