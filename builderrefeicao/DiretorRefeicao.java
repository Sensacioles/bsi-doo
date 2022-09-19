
package builderrefeicao;

/**
 *
 * @author Giovanni Sencioles
 */
public class DiretorRefeicao {        
    
    public Refeicao preparaNaoVegetariana(String sabor, String tipoBebida, String opi){       
        Refeicao novaRefeicao = new Refeicao();
        NonVegetarianoBuilder refeicaoBuilder = new NonVegetarianoBuilder(novaRefeicao);        
        if(tipoBebida.equalsIgnoreCase("refrigerante")){
            refeicaoBuilder.adicionarRefrigerante(sabor);
        } 
        else{
            refeicaoBuilder.adicionarSuco(sabor);
        }
        if(opi=="batata"){
            refeicaoBuilder.adicionarBatata();
        }        
        refeicaoBuilder.preparaHamburgerCarne();
        return novaRefeicao;        
    }     
    public Refeicao preparaVegetariana(String sabor, String tipoBebida, String opi){        
        Refeicao novaRefeicao = new Refeicao();
        VegetarianoBuilder refeicaoBuilder = new VegetarianoBuilder(novaRefeicao);        
        if(tipoBebida.equalsIgnoreCase("refrigerante")){
            refeicaoBuilder.adicionarRefrigerante(sabor);
        }  
        else{
            refeicaoBuilder.adicionarSuco(sabor);
        }  
        if(opi=="batata"){
            refeicaoBuilder.adicionarBatata();
        }
        refeicaoBuilder.preparaHamburgerVegetariano();
        return novaRefeicao;        
    }            
    
}
