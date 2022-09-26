package serializacaomensagem;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author Giovanni Sencioles
 */
public class ReceiveUsuario {
    public static void main(String[] args) throws Exception{
        Usuario user;
        String path = new java.io.File(".").getCanonicalPath();
        FileInputStream arqSerialized = new FileInputStream(
            path+"\\serializacaomensagem\\usuario_serial.ser");
        try (ObjectInputStream objSerialized = new ObjectInputStream(
                arqSerialized)) {
            user = (Usuario) objSerialized.readObject();
        }
        System.out.printf("Usuario deserializado!\nNome: %s",user.getNome());
    }
}
