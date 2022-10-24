package observeremail;
import java.util.ArrayList;

/** @author Giovanni Sencioles */

public class Observable {
    ArrayList<Observador> monitores = new ArrayList();
    
    public void addObservador(Observador o){
        this.monitores.add(o);
    }
    public void rmObservador(Observador r){
        this.monitores.remove(r);
    }
    public void ntObservador(){
        for(Observador n : monitores){
            n.update(this);
        }
    }
}
