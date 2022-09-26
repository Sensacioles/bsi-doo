package serializacaomensagem;
import java.io.Serializable;
/** 
 * @author Giovanni Sencioles
 */
public class Usuario implements Serializable{
    private String nome;
    Usuario(String nm){
        this.nome = nm;
    }
    public final String getNome(){
        return this.nome;
    }
    public final void setNome(String nm){
        this.nome = nm;
    }
}
