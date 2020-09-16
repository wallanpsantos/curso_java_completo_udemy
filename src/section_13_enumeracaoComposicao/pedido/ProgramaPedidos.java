package section_13_enumeracaoComposicao.pedido;

import section_13_enumeracaoComposicao.pedido.entities.*;
import section_13_enumeracaoComposicao.pedido.entities.OrdemEntity;

import java.util.Date;


/**
 * @author Wallan Pereira
 * @since 18/06/2020
 */
public class ProgramaPedidos {

    public static void main(String[] args) {

        OrdemEntity ordemEntity = new OrdemEntity(1, new Date(), section_13_enumeracaoComposicao.pedido.EnumStatusPedido.PENDING_PAYMENT);

        System.out.println(ordemEntity);

        section_13_enumeracaoComposicao.pedido.EnumStatusPedido enumStatusPedido = section_13_enumeracaoComposicao.pedido.EnumStatusPedido.valueOf("SHIPPED");

        System.out.println(enumStatusPedido);
    }
}
