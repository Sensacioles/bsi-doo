package fabrica_abstrata.fabrica.abstrata;


import fabrica_abstrata.fabrica.abstrata.modelo.Cobranca;
import fabrica_abstrata.fabrica.abstrata.modelo.CobrancaClaro;
import fabrica_abstrata.fabrica.abstrata.modelo.EnvioSMS;
import fabrica_abstrata.fabrica.abstrata.modelo.EnvioSMSClaro;
/**
 *
 * @author Giovanni Sencioles
 */
public class FabricaClaro extends FabricaAbstrataEnvios{
    @Override
    public EnvioSMS criaEnvioSMS(){
        return new EnvioSMSClaro("Assincrono");
    }
    @Override
    public Cobranca criaCobranca(){
        return new CobrancaClaro();
    }
}
