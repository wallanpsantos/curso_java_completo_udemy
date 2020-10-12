package section_19_introducao_generics.services;


import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    List<T> listaValores = new ArrayList<>();

    public void adicionarValor(T valor) {
        listaValores.add(valor);
    }

    public T primeiro() {
        if (listaValores.isEmpty()) {
            throw new IllegalArgumentException("Lista está vazia");
        }

        return listaValores.get(0);
    }

    public void exibirPrint() {
        System.out.println("[");
        if (!listaValores.isEmpty()) {
            System.out.println(listaValores.get(0));
        }
        System.out.println("]");
    }
}
