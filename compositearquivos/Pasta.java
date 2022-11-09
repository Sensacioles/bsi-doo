package compositearquivos;

import java.util.ArrayList;

public class Pasta implements Elemento{
    private String nome;
    private ArrayList<Arquivo> lstFile;
    private ArrayList<Pasta> lstFolder;
    Pasta(String n, ArrayList<Arquivo> lsfi, ArrayList<Pasta> lsfo){
        this.nome = n;
        this.lstFile = lsfi;
        this.lstFolder = lsfo;
    }
    public String getNome(){
        return this.nome;
    }
    public Arquivo getArquivo(ArrayList<Arquivo> lsfi, int i){
        return lsfi.get(i);
    }
    public Pasta getPasta(ArrayList<Pasta> lsfo, int i){
        return lsfo.get(i);
    }
    public int getNumArquivos(ArrayList<Arquivo> lsfi){
        return lsfi.size();
    }
    public int getNumPastas(ArrayList<Pasta> lsfo){
        return lsfo.size();
    }
    public int getTotal(){
        return this.getNumArquivos(this.lstFile)+this.getNumPastas(this.lstFolder);
    }
    public void addArquivo(ArrayList<Arquivo> lsfi, Arquivo file){
        lsfi.add(file);
    }
    public void addPasta(ArrayList<Pasta> lsfo, Pasta folder){
        lsfo.add(folder);
    }
    public void rmArquivo(ArrayList<Arquivo> lsfi, int i){
        lsfi.remove(i);
    }
    public void rmPasta(ArrayList<Pasta> lsfo, int i){
        lsfo.remove(i);
    }
    @Override
    public int obterTamanho() {
        int tam = 0;
        Elemento elem;
        for(int i=0;i<(this.getNumPastas(this.lstFolder));i++){
            elem = this.getPasta(lstFolder, i);
            tam += elem.obterTamanho();
            for(int j=0;j<this.getNumArquivos(this.lstFile);j++){
                elem = this.getArquivo(this.lstFile, j);
                tam += elem.obterTamanho();
            }
        }
        return tam;
    }
}
