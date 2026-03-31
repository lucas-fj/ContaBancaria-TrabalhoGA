//**Classe para o tipo Conta Investimento herda atributos das classes Data e ContaBancaria */

public class ContaInvestimento extends ContaBancaria {
    //atributos
    private Data dtVencimento;

    //construtor
    public ContaInvestimento(Cliente cliente, double saldoInicial, Data dtVencimento) {
        super(cliente, saldoInicial);
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
        if (op.getTipo() == 'D') { //depósito
            saldo += op.getValor();
            depositos.registrarMovimentacao(op.getValor());
            System.out.println("Novo saldo: R$" + saldo);
        }
    }
}