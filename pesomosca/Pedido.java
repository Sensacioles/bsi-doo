/**@author Giovanni Sencioles */
package pesomosca;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Item> itens = new ArrayList<Item>();
    
    public ArrayList<Item> getItens(){
        return this.itens;
    }
    public void addItemPedido(Item i){
        this.itens.add(i);
    }
    public void setItens(ArrayList<Item> i){
        this.itens = i;
    }
}
