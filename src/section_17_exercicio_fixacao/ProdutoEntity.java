package section_17_exercicio_fixacao;

public class ProdutoEntity {

    private String nome;
    private Double valor;
    private Integer quantidade;

    public ProdutoEntity(String nome, Double valor, Integer quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double total() {
        return getValor() * getQuantidade();
    }

    @Override
    public String toString() {
        return "ProdutoEntity{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }
}
