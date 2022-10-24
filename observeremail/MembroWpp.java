package observeremail;

/** @author Giovanni Sencioles */

public class MembroWpp implements Observador{
    private int numero;
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int n){
        this.numero = n;
    }
    @Override
    public void update(Observable obs) {
        System.out.println("Mensagem recebida via zap");
    }
}
