/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica_abstrata.fabrica.abstrata;

import fabrica_abstrata.fabrica.abstrata.modelo.Cobranca;
import fabrica_abstrata.fabrica.abstrata.modelo.CobrancaTim;
import fabrica_abstrata.fabrica.abstrata.modelo.EnvioSMS;
import fabrica_abstrata.fabrica.abstrata.modelo.EnvioSMSTim;

/**
 *
 * @author felipe
 */
public class FabricaTim extends FabricaAbstrataEnvios{
    
    @Override
    public EnvioSMS criaEnvioSMS () {
        return new EnvioSMSTim("Assincrono");
    }
    @Override
    public Cobranca criaCobranca() {
        return new CobrancaTim();
    }
}

