/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica_abstrata.fabrica.abstrata.modelo;


/**
 *
 * @author felipe
 */
public interface EnvioSMS {    
    public boolean enviar(Mensagem msg, int telefone);                    
}
