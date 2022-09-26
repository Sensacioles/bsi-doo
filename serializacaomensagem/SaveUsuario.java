package serializacaomensagem;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * @author Giovanni Sencioles
 */
public class SaveUsuario {
    public static void main(String[] args) throws IOException{
        String path = new java.io.File(".").getCanonicalPath();
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o nome do usuario: ");
        String name = input.nextLine();
        Usuario user = new Usuario(name);
        FileOutputStream arqSerialized = new FileOutputStream(
            path+"\\serializacaomensagem\\usuario_serial.ser");
        try (ObjectOutputStream objSerialized = new ObjectOutputStream(
                arqSerialized)) {
            objSerialized.writeObject(user);
        }
    }
}
