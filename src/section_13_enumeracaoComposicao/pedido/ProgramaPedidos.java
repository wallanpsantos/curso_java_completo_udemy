package section_13_enumeracaoComposicao.pedido;


import section_13_enumeracaoComposicao.pedido.StatusPedidoEnum;
import section_13_enumeracaoComposicao.pedido.entities.OrdemEntity;

import java.util.Date;

/**
 * @author Wallan Pereira
 * @since 18/06/2020
 */
public class ProgramaPedidos {
    public static void main(String[] args) {

        OrdemEntity ordemEntity = new OrdemEntity(1, new Date(), StatusPedidoEnum.PENDING_PAYMENT);

        System.out.println(ordemEntity);
    }
}
