package serializacaomensagem;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * @author Giovanni Sencioles
 */
public class SaveMensagem {
    public static void main(String[] args) throws IOException{
        String path = new java.io.File(".").getCanonicalPath();
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o texto da mensagem: ");
        String text = input.nextLine();
        Mensagem message = new Mensagem(text);
        FileOutputStream arqSerialized = new FileOutputStream(
            path+"\\serializacaomensagem\\mensagem_serial.ser");
        try (ObjectOutputStream objSerialized = new ObjectOutputStream(
                arqSerialized)) {
            objSerialized.writeObject(message);
        }
    }
}
