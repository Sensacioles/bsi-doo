

package builderrefeicao;

/**
 *
 * @author Giovanni Sencioles
 */
public abstract class RefeicaoBuilder {    
    Refeicao refeicao;        
    
    public void adicionarSuco(String sabor){                                
        refeicao.setBebida(new Suco(sabor));        
    }  
    public void adicionarRefrigerante(String sabor){
        refeicao.setBebida(new Refrigerante(sabor));        
    }   
    public void adicionarBatata(){
        refeicao.setBatata(new Batata());
    }
}
