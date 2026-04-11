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
            saques.setQuantidade(saques.getQuantidade() + 1);
            saques.setValorTotal(saques.getValorTotal() + op.getValor());

            System.out.printf("Saque realizado! Novo saldo: R$ %.2f\n", saldo);
        }
    }
}