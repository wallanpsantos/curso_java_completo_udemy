package section_19_ordenacao_set;

import section_19_ordenacao_set.entities.Produto;

import java.util.Set;
import java.util.TreeSet;

public class ProgramaCompararPorProduto {
    public static void main(String[] args) {

        Produto p1 = new Produto("Dell", 12000.00);
        Produto p2 = new Produto("Apple", 20000.00);
        Produto p3 = new Produto("HP", 3000.00);
        Produto p4 = new Produto("Asus", 2000.00);

        // Sempre que usar TreeSet deve implementar o Comparable<> para ordenar
        Set<Produto> set = new TreeSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        for (Produto produto : set) {
            // Sem toString()
            System.out.println(produto.getNome() + " " + produto.getPreco());
        }

        for (Produto produto : set) {
            // Com toString()
            System.out.println(produto);
        }
    }
}
