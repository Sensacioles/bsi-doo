

package fabrica_abstrata.fabrica.abstrata;

import fabrica_abstrata.fabrica.abstrata.modelo.Cobranca;
import fabrica_abstrata.fabrica.abstrata.modelo.EnvioSMS;

/**
 *
 * @author felipe
 */
public abstract class FabricaAbstrataEnvios {        
    public abstract Cobranca criaCobranca();
    public abstract EnvioSMS criaEnvioSMS();
}
