package builderrefeicao;
/**
 *
 * @author Giovanni Sencioles
 */
public class BatataBuilder extends RefeicaoBuilder{ 
    public void preparaBatata(){
        System.out.println("cria batata");
        this.refeicao.setBatata(new Batata());                
    }        
}
