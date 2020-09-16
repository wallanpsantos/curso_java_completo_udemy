package section_14_exercicio_fixacao.entities;

public class ProdutoImportado extends Produto {

    private Double taxaPersonalizada;

    public ProdutoImportado(Double taxaPersonalizada) {
        this.taxaPersonalizada = taxaPersonalizada;
    }

    public ProdutoImportado(String nome, Double preco, Double taxaPersonalizada) {
        super(nome, preco);
        this.taxaPersonalizada = taxaPersonalizada;
    }

    public Double getTaxaPersonalizada() {
        return taxaPersonalizada;
    }

    public void setTaxaPersonalizada(Double taxaPersonalizada) {
        this.taxaPersonalizada = taxaPersonalizada;
    }

    public String etiquetaPreco() {
        return getNome() + " $ " + precoTotal() + " (Taxa: $" + taxaPersonalizada + ")";
    }

    public Double precoTotal() {
        return getPreco() + taxaPersonalizada;
    }
}
