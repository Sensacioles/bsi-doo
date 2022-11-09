package compositearquivos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Arquivo> lstFileRaiz = new ArrayList<Arquivo>();
        ArrayList<Pasta> lstFolderRaiz = new ArrayList<Pasta>();
        Pasta raiz = new Pasta("raiz", lstFileRaiz, lstFolderRaiz);
        Arquivo x = new Arquivo(3, "x.txt");
        raiz.addArquivo(lstFileRaiz, x);
        ArrayList<Arquivo> lstFileHome = new ArrayList<Arquivo>();
        ArrayList<Pasta> lstFolderHome = new ArrayList<Pasta>();
        Pasta home = new Pasta("home", lstFileHome, lstFolderHome);
        Arquivo file1 = new Arquivo(1, "file1");
        Arquivo file2 = new Arquivo(2, "file2");
        Pasta vazia = new Pasta("vazia", null, null);
        home.addArquivo(lstFileHome, file1);
        home.addArquivo(lstFileHome, file2);
        home.addPasta(lstFolderHome, vazia);
        System.out.println(raiz.obterTamanho());
    }
}
