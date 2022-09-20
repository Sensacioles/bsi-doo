package singleton_telefonia;

import java.io.IOException;

public class ExecTelefone {
    public static void main(String[] args) throws IOException{
		int ultimo = GeraTelefone.lerUltimo();
		int novoUltimo = ultimo;
		
		NumeroSingleton ins = NumeroSingleton.getTel();
		ins.setNumero(ultimo);
        for(int i=1;i<3;i++){
            novoUltimo = ins.getNovo();
        }
		System.out.println(novoUltimo);
		GeraTelefone.escreveUltimo(Integer.toString(novoUltimo));
	}
}