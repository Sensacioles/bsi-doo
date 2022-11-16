package padraotemplate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExportHtml extends ExportAbstract{
    private static BufferedWriter out = null;

    public ExportHtml(){
        super();
    }
    @Override
    void geraArquivo(){
        String current = null;
        try{
            current = new java.io.File(".").getCanonicalPath();
            File file = new File(current + "\\src\\" + "index.html");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            out = new BufferedWriter(fw);
            out.write("<HTML><BODY>");
        }
        catch (IOException e){
            e.printStackTrace();
        } 
    }
    @Override
    void escreveArquivo(String t) {
        try {
           out.write("<BR>" + t);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }        
    }
    @Override
    void exportaArquivo(String txt) {
        String[] txtLinhas = txt.split("\n");
        for(Object linhas : txtLinhas ){
            escreveArquivo((String)linhas);
        }   
        salvaArquivo();
    }
    @Override
    void salvaArquivo() {
        try{
            out.write("</BODY>");
            out.write("</HTML>");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
