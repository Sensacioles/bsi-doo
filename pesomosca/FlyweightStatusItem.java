/**@author Giovanni Sencioles */
package pesomosca;

import java.util.HashMap;

import pesomosca.StatusItem.Estado;

public class FlyweightStatusItem {
    private static HashMap<StatusItem.Estado, StatusItem> MapStatus = new HashMap<>();
    
    public FlyweightStatusItem(){
       this.MapStatus.put(StatusItem.Estado.CARRINHO,new StatusItem(Estado.CARRINHO, true, false));
       this.MapStatus.put(StatusItem.Estado.FECHADO,new StatusItem(Estado.FECHADO, true, false));
       this.MapStatus.put(StatusItem.Estado.PAGO,new StatusItem(Estado.PAGO, true, true));
       this.MapStatus.put(StatusItem.Estado.ENVIADO,new StatusItem(Estado.ENVIADO, false, true));
       this.MapStatus.put(StatusItem.Estado.ENTREGUE,new StatusItem(Estado.ENTREGUE, false, true));

    }
    public static StatusItem get(Estado carrinho) {
        return MapStatus.get(carrinho);
    }
}
