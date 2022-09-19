
package builderrefeicao;

/**
 *
 * @author Giovanni Sencioles
 */
public class Refeicao {
    
    private Hamburger hamburger;
    private Bebida bebida;
    private Batata batata;
    public Hamburger getHamburger() {
        return hamburger;
    }
    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }
    public Batata getBatata(){
        return batata;
    }
    public void setBatata(Batata batata){
        this.batata = batata;
    }
    public Bebida getBebida() {
        return bebida;
    }
    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }
}
