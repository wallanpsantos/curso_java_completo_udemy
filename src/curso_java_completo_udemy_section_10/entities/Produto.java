package curso_java_completo_udemy_section_10.entities;

import java.util.StringJoiner;

/**
 * The type Produto.
 */
public class Produto {

    String nome;
    Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Produto.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .add("preco=" + preco)
                .toString();
    }
}
