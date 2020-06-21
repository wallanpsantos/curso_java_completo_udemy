package section_13_enumeracaoComposicao.pedido.entities;

import section_13_enumeracaoComposicao.pedido.EnumStatusPedido;

import java.util.Date;


public class OrdemEntity {

    private Integer id;
    private Date momento;
    private EnumStatusPedido enumStatusPedido;

    public OrdemEntity() {
    }

    public OrdemEntity(Integer id, Date momento, EnumStatusPedido enumStatusPedido) {
        this.id = id;
        this.momento = momento;
        this.enumStatusPedido = enumStatusPedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public EnumStatusPedido getEnumStatusPedido() {
        return enumStatusPedido;
    }

    public void setEnumStatusPedido(EnumStatusPedido enumStatusPedido) {
        this.enumStatusPedido = enumStatusPedido;
    }

    @Override
    public String toString() {
        return "OrdemEntity{" +
                "id=" + id +
                ", momento=" + momento +
                ", statusPedidoEnum=" + enumStatusPedido +
                '}';
    }
}
