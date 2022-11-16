package padraotemplate;

public abstract class ExportAbstract {
    public ExportAbstract(){
        geraArquivo();
    }
    abstract void geraArquivo();
    abstract void escreveArquivo(String t);
    abstract void exportaArquivo(String t);
    abstract void salvaArquivo();
}
