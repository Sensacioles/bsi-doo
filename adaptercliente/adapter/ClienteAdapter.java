package adapter;

import lib.ClienteExterno;
import model.Cliente;

public class ClienteAdapter extends Cliente{
    private Cliente cliente;
    public Cliente getCliente(){
        return this.cliente;
    }
    public void setCliente(ClienteExterno ext){
        Cliente cl = new Cliente();
        cl.setNomeCompleto(ext.getNome()+" "+ext.getSobreNome());
        cl.setTelefone("("+ext.getDddTelefone()+")"+" "+ext.getTelefone());
        cl.setEmail(ext.getEmail());
        cl.setCelular("("+ext.getDddCelular()+")"+" "+ext.getCelular());
        this.cliente = cl;
    }
}
