//**Classe conta bancária contém os atributos principais da conta
// e o método movimenta() para movimentações da conta*/

public  abstract class ContaBancaria {
    
    //atributos 
    Cliente cliente;
    double saldoInicial;
    double saldo;
    Movimentacao depositos;
    Movimentacao saques;
    Movimentacao juros;

    //getters e setters
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public double getSaldoInicial() {
        return saldoInicial;
    }
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
    public Movimentacao getDepositos() {
        return depositos;
    }
    public void setDepositos(Movimentacao depositos) {
        this.depositos = depositos;
    }
    public Movimentacao getSaques() {
        return saques;
    }
    public void setSaques(Movimentacao saques) {
        this.saques = saques;
    }
    public Movimentacao getJuros() {
        return juros;
    }
    public void setJuros(Movimentacao juros) {
        this.juros = juros;
    }

    //construtor 
    public ContaBancaria(Cliente cliente, double saldoInicial, Movimentacao depositos, Movimentacao saques,
            Movimentacao juros) {
        this.cliente = cliente;
        this.saldoInicial = saldoInicial;
        this.depositos = depositos;
        this.saques = saques;
        this.juros = juros;
    }

    //métodos
    public abstract void movimenta(Operacao op);    
    
}