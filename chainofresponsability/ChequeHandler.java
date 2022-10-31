package chainofresponsability;

import java.util.List;
import javax.swing.JOptionPane;

public class ChequeHandler  extends AbstractPagamentoHandler {
    public static final int CHEQUE = 3;
    @Override
    protected int  handlePagamento(int valor) {
        int valorRestante = super.perguntaPagamento("Qual o valor para o "
                + "pagamento com Cheque?", valor);
        JOptionPane.showMessageDialog(null, "Cheque gerado. Valor restante:" 
                + valorRestante);
        return valorRestante;
    }
    @Override
    protected int getTipoPagamento() {
        return CHEQUE;
    }
}
