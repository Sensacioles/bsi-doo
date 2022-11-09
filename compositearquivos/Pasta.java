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
    public void addArquivo(ArrayList<Arquivo> lsfi, Arquivo file){
        lsfi.add(file);
    }
    public void addPasta(ArrayList<Pasta> lsfo, Pasta folder){
        lsfo.add(folder);
    }
    @Override
    public int obterTamanho() {
        for(int i=0;i<=this.size();i++){

        } //somatoria
    }
}
