//**Classe do tipo Conta Poupanca herda atributos da classe ContaBancaria */

public class ContaPoupanca extends ContaBancaria{
    
    //atributos
    private int diaAniversario;

    //construtor
    public ContaPoupanca(Cliente cliente, double saldoInicial, Movimentacao depositos, Movimentacao saques,
            Movimentacao juros, int diaAniversario) {
        super(cliente, saldoInicial, depositos, saques, juros);
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
        if (op.getTipo() == 'D' || op.getTipo() == 'd') { //depósito
           saldo += op.getValor();
           System.out.println("Novo saldo: R$" + saldo);
        } else if(op.getTipo() == 'S' || op.getTipo() == 's'){ //saque
            if (saldo >= op.getValor()) {
                saldo -= op.getValor();
                System.out.println("Novo saldo: R$" + saldo);
            } else{
                System.out.println("Saldo insuficiente.");
                System.out.println("Saldo: R$" + saldo);
            }
        } else{
            System.out.println("Operação não permitida para Conta Corrente.");
        }
    }
}