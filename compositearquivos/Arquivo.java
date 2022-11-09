package compositearquivos;

public class Arquivo implements Elemento{
    private int tamanho;
    private String nome;
    Arquivo(int t, String n){
        this.tamanho = t;
        this.nome = n;
    }
    public int obterTamanho(){
        return this.tamanho;
    }
    public String obterNome(){
        return this.nome;
    }
}
