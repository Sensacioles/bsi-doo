package serializacaomensagem;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 * @author Giovanni Sencioles
 */
public class ReceiveMensagem {
    public static void main(String[] args) throws Exception{
        Mensagem msg;
        String path = new java.io.File(".").getCanonicalPath();
        FileInputStream arqSerialized = new FileInputStream(
            path+"\\serializacaomensagem\\mensagem_serial.ser");
        try (ObjectInputStream objSerialized = new ObjectInputStream(
                arqSerialized)) {
            msg = (Mensagem) objSerialized.readObject();
        }
        System.out.printf("Mensagem deserializada!\nConteudo: %s",msg.getTexto());
    }
}
