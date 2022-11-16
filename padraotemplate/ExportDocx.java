package padraotemplate;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class ExportDocx extends ExportAbstract{
    private static BufferedWriter out1 = null;
    private static XWPFDocument document;

    public ExportDocx(){
        super();
    }
    @Override
    void geraArquivo() {
        String current = null;
        try {
            current = new java.io.File(".").getCanonicalPath();
            out1 = new FileOutputStream(new File(current + "\\src\\" + "word.docx"));
            document = new XWPFDocument();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    void escreveArquivo(String t) {
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(t);
    }
    @Override
    void exportaArquivo(String t) {
        String[] txtLinhas = t.split("\n");
        for(Object linhas : txtLinhas ){
            escreveArquivo((String)linhas);
        }   
        salvaArquivo(); 
    }
    @Override
    void salvaArquivo() {
        try {
            document.write(out1);
            out1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
