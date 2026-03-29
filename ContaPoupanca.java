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
}