package fabrica_abstrata.fabrica.abstrata.modelo;


/**
 *
 * @author Giovanni Sencioles
 */
public class CobrancaClaro implements Cobranca{
    @Override
    public void cobrar(int telefone){
        System.out.println("Cobrar via claro");
    }
}
