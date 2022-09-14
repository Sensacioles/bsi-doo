package fabrica_abstrata.fabrica.abstrata.modelo;


/**
 *
 * @author Giovanni Sencioles
 */
public class EnvioSMSClaro implements EnvioSMS{
    public EnvioSMSClaro(String config){

    }
    @Override
    public boolean enviar(Mensagem msg, int telefone){
        System.out.println("Enviando mensagem:" + msg.texto +
        " para o telefone claro:" + telefone);
        return true;
    }
}
