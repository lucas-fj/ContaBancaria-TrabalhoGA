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
            System.out.printf("Depósito realizado! Novo saldo: R$ %.2f\n", saldo);

        } else if (op.getTipo() == 'S') {//saque

        // verificar saldo
        if (op.getValor() > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }

        int[] notas = {100, 50, 20, 10, 5, 2};
        int[] qtdNotas = new int[notas.length];

        double restante = op.getValor();

        for (int i = 0; i < notas.length; i++) {
            qtdNotas[i] = (int) (restante / notas[i]);
            restante = restante % notas[i];
        }

        // não consegue formar valor
        if (restante != 0) {
            System.out.println("Não é possível sacar esse valor com as notas disponíveis.");
            return;
        }

        // mostrar notas
        System.out.println("\nNotas entregues:");
        for (int i = 0; i < notas.length; i++) {
            if (qtdNotas[i] > 0) {
                System.out.println(qtdNotas[i] + " nota(s) de R$" + notas[i]);
            }
        }

            // atualizar saldo
            saldo -= op.getValor();

            // registrar saque
            saques.registrarMovimentacao(op.getValor());

            System.out.printf("Saque realizado! Novo saldo: R$ %.2f\n", saldo);
        }
    }
}