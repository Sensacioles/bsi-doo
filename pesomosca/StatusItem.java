/**@author Giovanni Sencioles */
package pesomosca;

public class StatusItem {
    public enum Estado { CARRINHO, FECHADO, PAGO, ENVIADO , ENTREGUE };
    private Estado estado;
    private boolean podeCancelar;
    private boolean compraConcluida;
    
    public StatusItem(Estado e, boolean pc, boolean cc){
        this.estado = e;
        this.podeCancelar = pc;
        this.compraConcluida = cc;
    }
    public Estado getEstado(){
        return this.estado;
    }
    public void setEstado(Estado e){
        this.estado = e;
    }
    public boolean getCancel(){
        return this.podeCancelar;
    }
    public void setCancel(boolean pc){
        this.podeCancelar = pc;
    }
    public boolean getCompra(){
        return this.compraConcluida;
    }
    public void setCompra(boolean cc){
        this.compraConcluida = cc;
    }
}
