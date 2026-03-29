//**Classe para o tipo Conta Investimento herda atributos das classes Data e ContaBancaria */

public class ContaInvestimento extends ContaBancaria {
    //atributos
    private Data dtVencimento;

    //construtor
    public ContaInvestimento(Cliente cliente, double saldoInicial, Movimentacao depositos, Movimentacao saques,
            Movimentacao juros, Data dtVencimento) {
        super(cliente, saldoInicial, depositos, saques, juros);
        this.dtVencimento = dtVencimento;
    }

    //getters e setters
    public Data getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(Data dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    //métodos
    @Override
     public void movimenta(Operacao op){
        if (op.getTipo() == 'D' || op.getTipo() == 'd') {
           saldo += op.getValor();
           System.out.println("Novo saldo: R$" + saldo);
        } else if (op.getTipo() == 'J' || op.getTipo() == 'j') {
            double valorJuros = saldo * (op.getValor() / 100);
            saldo += valorJuros;
        }
    }
}