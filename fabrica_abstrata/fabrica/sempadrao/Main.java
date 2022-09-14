/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica_abstrata.fabrica.sempadrao;


import javax.swing.JOptionPane;

import fabrica_abstrata.fabrica.abstrata.modelo.Cobranca;
import fabrica_abstrata.fabrica.abstrata.modelo.CobrancaClaro;
import fabrica_abstrata.fabrica.abstrata.modelo.CobrancaTim;
import fabrica_abstrata.fabrica.abstrata.modelo.CobrancaVivo;
import fabrica_abstrata.fabrica.abstrata.modelo.EnvioSMS;
import fabrica_abstrata.fabrica.abstrata.modelo.EnvioSMSClaro;
import fabrica_abstrata.fabrica.abstrata.modelo.EnvioSMSTim;
import fabrica_abstrata.fabrica.abstrata.modelo.EnvioSMSVivo;
import fabrica_abstrata.fabrica.abstrata.modelo.Mensagem;

/**
 *
 * @author Giovanni Sencioles
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String escolha = JOptionPane.showInputDialog("Tim, Vivo ou Claro?");
        int telefone = Integer.parseInt(JOptionPane.showInputDialog("Telefone?"));
        String texto = JOptionPane.showInputDialog("Mensagem");
        Mensagem msg = new Mensagem(texto);
        EnvioSMS envio = null;
        Cobranca cobranca = null;
        if (escolha.equalsIgnoreCase("tim")) {
            envio = new EnvioSMSTim("assincrono");
            if (envio.enviar(msg, telefone)) {
                cobranca = new CobrancaTim();
                cobranca.cobrar(telefone);
            } else if (escolha.equalsIgnoreCase("vivo")) {
                envio = new EnvioSMSVivo();
                if (envio.enviar(msg, telefone)) {
                    cobranca = new CobrancaVivo();
                    cobranca.cobrar(telefone);
                }
            }
            else if(escolha.equalsIgnoreCase("claro")){
                envio = new EnvioSMSClaro("assincrono");
                if(envio.enviar(msg,telefone)){
                    cobranca = new CobrancaClaro();
                    cobranca.cobrar(telefone);
                }
            }
        }
    }
}
