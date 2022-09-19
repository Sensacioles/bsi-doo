
package builderrefeicao;

/**
 *
 * @author Giovanni Sencioles
 */
public class Main {
    
    public static void main(String[] args) {
        
        DiretorRefeicao criaRefeicao = new DiretorRefeicao();      
        //controi uma refeicao.
        Refeicao refeicao1 = criaRefeicao.preparaNaoVegetariana("laranja", "suco"," ");
        Refeicao refeicao2 = criaRefeicao.preparaNaoVegetariana("laranja", "suco","batata");            
        Refeicao refeicao3 = criaRefeicao.preparaVegetariana("guarana", "refrigerante","12313");       
        Refeicao refeicao4 = criaRefeicao.preparaVegetariana("guarana", "refrigerante","batata");
    }    
}
