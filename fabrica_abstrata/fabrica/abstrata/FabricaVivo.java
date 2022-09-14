/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica_abstrata.fabrica.abstrata;

import fabrica_abstrata.fabrica.abstrata.modelo.Cobranca;
import fabrica_abstrata.fabrica.abstrata.modelo.CobrancaVivo;
import fabrica_abstrata.fabrica.abstrata.modelo.EnvioSMS;
import fabrica_abstrata.fabrica.abstrata.modelo.EnvioSMSVivo;

/**
 *
 * @author Giovanni Sencioles
 */
public class FabricaVivo extends FabricaAbstrataEnvios{ 

    @Override
    public Cobranca criaCobranca() {
        return new CobrancaVivo();
    }
    @Override
    public EnvioSMS criaEnvioSMS() {
        return new EnvioSMSVivo(); 
    }
}

