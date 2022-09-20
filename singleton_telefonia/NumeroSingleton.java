package singleton_telefonia;
/**
* @author Giovanni Sencioles
*/

public class NumeroSingleton {
    private static NumeroSingleton telefone;
    private int numero;
    public synchronized static NumeroSingleton getTel(){
        if(telefone == null){
            telefone = new NumeroSingleton();
        }
        return telefone;
    }
    public int getNumero(){
        return numero;
    }
    public synchronized int getNovo(){
        return numero++;
    }
    public void setNumero(int n){
        this.numero = n;
    }
}
