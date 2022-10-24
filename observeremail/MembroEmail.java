package observeremail;

/** @author Giovanni Sencioles */
public class MembroEmail implements Observador{
    private String email;
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String e){
        this.email = e;
    }
    @Override
    public void update(Observable obs) {
        System.out.println("Mensagem recebida via e-mail");
    }
}
