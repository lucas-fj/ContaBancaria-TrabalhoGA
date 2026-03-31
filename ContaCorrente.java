//**Classe do tipo Conta Corrente herda atributos da classe ContaBancaria */

public class ContaCorrente extends ContaBancaria {

    // atributos
    private double limiteCredito;

    //construtor
    public ContaCorrente(Cliente cliente, double saldoInicial, double limiteCredito) {
        super(cliente, saldoInicial);
        this.limiteCredito = limiteCredito;
    }

    //getters e setters
    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    //método movimenta (faz apenas as operações de depósito e saque verificando se o saldo está disponível e o limite ok)
    public void movimenta(Operacao op){
        if (op.getTipo() == 'D') { //depósito
            saldo += op.getValor();
            depositos.registrarMovimentacao(op.getValor());
            System.out.println("Novo saldo: R$" + saldo);
        }
    }
}