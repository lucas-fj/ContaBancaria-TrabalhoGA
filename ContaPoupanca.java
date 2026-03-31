//**Classe do tipo Conta Poupanca herda atributos da classe ContaBancaria */

public class ContaPoupanca extends ContaBancaria{
    
    //atributos
    private int diaAniversario;

    //construtor
    public ContaPoupanca(Cliente cliente, double saldoInicial, int diaAniversario) {
        super(cliente, saldoInicial);
        this.diaAniversario = diaAniversario;

        
    }

    //getters e setters
    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    //métodos
    public void movimenta(Operacao op){
         if (op.getTipo() == 'D') { //depósito 
            saldo += op.getValor();
            depositos.registrarMovimentacao(op.getValor());
            System.out.println("Novo saldo: R$" + saldo);
        }
    }
}