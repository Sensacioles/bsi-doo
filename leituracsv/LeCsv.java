package leituracsv;
/**
 * @author Giovanni Sencioles
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class LeCsv {
     public LinkedList<Cliente> leCsvClientes() throws IOException{         
        LinkedList<Cliente> clientes = new  LinkedList<Cliente>();             
        String current = new java.io.File( "." ).getCanonicalPath();
        File inputFile = new File(current + "\\leituracsv\\arquivo.csv");                
        FileReader in = new FileReader(inputFile);
        //Adicionado bufferedreader para ler linha a linha
        BufferedReader arqBuffer = new BufferedReader(in); 
        ArrayList<String> linhas = new ArrayList<>();
        String linha = arqBuffer.readLine();
        while(linha != null){
            linha = arqBuffer.readLine();
            if(linha != null){
                linhas.add(linha);
            }
        }
        for(int i=0;i<linhas.size();i++){
            String curr = linhas.get(i);
            String[] obj = curr.split(";");
            Cliente client = new Cliente();
            client.setId(obj[0]);
            client.setNome(obj[1]);
            client.setEmail(obj[2]);
            client.setTelefone(obj[4]);
            client.setTotalCompras(Double.parseDouble(obj[5]));
            clientes.add(client);
        }       
        in.close(); 
        arqBuffer.close();
        return clientes;
     }
}
