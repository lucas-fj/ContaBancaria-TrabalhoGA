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

            if (saldo > saldoMax) {
                saldoMax = saldo;
            }
            System.out.printf("Depósito realizado! Novo saldo: R$ %.2f\n", saldo);

        }   else if(op.getTipo() == 'J'){ //juros
            double juros2 = getSaldoInicial() * (op.getValor() / 100);
            op.setValor(juros2);
            setSaldo(getSaldoInicial() + op.getValor());
            juros.registrarMovimentacao(op.getValor());

            if (saldo > saldoMax) {
                saldoMax = saldo;
            }
            System.out.printf("Juros aplicado! Novo saldo: R$%.2f\n", saldo);
        }
    }
}
