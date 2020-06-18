package section_13_enumeracaoComposicao.pedido.entities;

import section_13_enumeracaoComposicao.pedido.StatusPedidoEnum;

import java.util.Date;


public class OrdemEntity {

    private Integer id;
    private Date momento;
    private StatusPedidoEnum statusPedidoEnum;

    public OrdemEntity() {
    }

    public OrdemEntity(Integer id, Date momento, StatusPedidoEnum statusPedidoEnum) {
        this.id = id;
        this.momento = momento;
        this.statusPedidoEnum = statusPedidoEnum;
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

    public StatusPedidoEnum getStatusPedidoEnum() {
        return statusPedidoEnum;
    }

    public void setStatusPedidoEnum(StatusPedidoEnum statusPedidoEnum) {
        this.statusPedidoEnum = statusPedidoEnum;
    }

    @Override
    public String toString() {
        return "OrdemEntity{" +
                "id=" + id +
                ", momento=" + momento +
                ", statusPedidoEnum=" + statusPedidoEnum +
                '}';
    }
}
