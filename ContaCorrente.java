//**Classe do tipo Conta Corrente herda atributos da classe ContaBancaria */

public class ContaCorrente extends ContaBancaria {

    // atributos
    private double limiteCredito;

    //construtor
    public ContaCorrente(Cliente cliente, double saldoInicial, Movimentacao depositos, Movimentacao saques,
            Movimentacao juros, double limiteCredito) {
        super(cliente, saldoInicial, depositos, saques, juros);
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
        if (op.getTipo() == 'D' || op.getTipo() == 'd') {
           saldo += op.getValor();
           System.out.println("Novo saldo: R$" + saldo);
        } else if(op.getTipo() == 'S' || op.getTipo() == 's'){
            if (saldo >= op.getValor() && limiteCredito >= op.getValor()) {
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