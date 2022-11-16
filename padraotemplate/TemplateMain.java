
package padraotemplate;


public class TemplateMain {

   
    public static void main(String[] args) {
        String texto = "linha 1\n" 
                + "linha2\n"
                + "fim\n";                                
      ExportHtml h = new ExportHtml();
      ExportDocx d = new ExportDocx();

      h.exportaArquivo(texto);
      d.exportaArquivo(texto);
    }
    
}
