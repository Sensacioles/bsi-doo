package singleton_telefonia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
* @author Giovanni Sencioles
*/
public class GeraTelefone {
    public static int lerUltimo() throws IOException{
        int ultimoTelefone = 0;
        BufferedReader buffRead = new BufferedReader(new FileReader("./singleton_telefonia/UltimoTelefone.txt"));
        String line = buffRead.readLine();
        if(line != null){
            ultimoTelefone = Integer.parseInt(line);
        }
        buffRead.close();
        return ultimoTelefone;
    }
    public static void escreveUltimo(String n) throws IOException{
        BufferedWriter bWriter = new BufferedWriter(new FileWriter("./singleton_telefonia/UltimoTelefone.txt"));
        bWriter.append(n);
        bWriter.close();
    }
}
