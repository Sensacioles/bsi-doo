package observeremail;

/** @author Giovanni Sencioles */
public class CaixaEntradaGrupo extends Observable{
    private String mensagem;
    
    public String getMensagem(){
        return this.mensagem;
    }
    public void setNovaMensagem(String msg){
        this.mensagem = msg;
    }
}
