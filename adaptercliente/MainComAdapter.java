

import adapter.ClienteAdapter;
import lib.ClienteExterno;
import visao.VisaoCliente;

public class MainComAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClienteExterno ce = new ClienteExterno();
        ce.setCelular("666666666");
        ce.setDddCelular("022");
        ce.setTelefone("56456455425");
        ce.setDddTelefone("013");
        ce.setEmail("valzer.lamperagem@bing.com");
        ce.setNome("Lula");
        ce.setSobreNome("Bolsonaro");
        VisaoCliente visao = new VisaoCliente();
        ClienteAdapter adaptado  = new ClienteAdapter();
        adaptado.setCliente(ce);
        visao.setInformacoesCliente(adaptado.getCliente());//espera um Cliente
        visao.setVisible(true);
    }
}
