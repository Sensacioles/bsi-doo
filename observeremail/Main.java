package observeremail;

/** @author Giovanni Sencioles */
public class Main {
    public static void main(String[] args){
        MembroEmail monitorEmail = new MembroEmail();
        monitorEmail.setEmail("junior.bola@zaz.com");
        MembroWpp monitorWpp = new MembroWpp();
        monitorWpp.setNumero(279999999);
        CaixaEntradaGrupo inbox = new CaixaEntradaGrupo();
        inbox.addObservador(monitorEmail);
        inbox.addObservador(monitorWpp);
        inbox.setNovaMensagem("teste zap");
        monitorWpp.update(inbox);
        System.out.println(inbox.getMensagem());
        inbox.setNovaMensagem("teste email");
        monitorEmail.update(inbox);
        System.out.println(inbox.getMensagem());
    }
}
