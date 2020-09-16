package section_14_exercicio_fixacao.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataManufatura;

    public ProdutoUsado(Date dataManufatura) {
        this.dataManufatura = dataManufatura;
    }

    public ProdutoUsado(String nome, Double preco, Date dataManufatura) {
        super(nome, preco);
        this.dataManufatura = dataManufatura;
    }

    public Date getDataManufatura() {
        return dataManufatura;
    }

    public void setDataManufatura(Date dataManufatura) {
        this.dataManufatura = dataManufatura;
    }


    public String etiquetaPreco() {
        return getNome() + " (usado) $ " + getPreco() + " (Data manufatura: " + simpleDateFormat.format(getDataManufatura()) + ")";
    }
}
