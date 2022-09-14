package fabrica.abstrata.botoes;

//import java.awt.Image;

import javax.swing.JButton;
/**
 *
 * @author Giovanni Sencioles
 */
public class FabricaBotaoIcone extends FabricaAbstrataBotoes{
    @Override
    public JButton criaBotaoOK(){
        return new ButtonOK();
    }
    @Override
    public JButton criaBotaoCancel(){
        return new ButtonCancel(); 
    }
}
