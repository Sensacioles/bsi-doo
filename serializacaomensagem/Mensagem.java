package serializacaomensagem;
import java.io.Serializable;
/**
 * @author Giovanni Sencioles
 */
public class Mensagem implements Serializable{
    private String texto;
    Mensagem(String msg){
        this.texto = msg;
    }
    public final String getTexto(){
        return this.texto;
    }
    public final void setTexto(String msg){
        this.texto = msg;
    }
}
