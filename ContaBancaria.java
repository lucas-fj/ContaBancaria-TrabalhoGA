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
     double saldoMin;
    double saldoMax;

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
    public ContaBancaria(Cliente cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldoInicial = saldoInicial;
        this.saldo = saldoInicial;
        this.saldoMin = saldoInicial;
        this.saldoMax = saldoInicial;

        this.depositos = new Movimentacao(0, 0);
        this.saques = new Movimentacao(0, 0);
        this.juros = new Movimentacao(0, 0);
    }
    //métodos
    public abstract void movimenta(Operacao op);  
   
    //método para mostrar extrato
    public void extrato(){
        //dados cliente e conta
        System.out.println("\n--- EXTRATO ---");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Nascimento: " + cliente.getDtNascimento());
        System.out.println("Saldo inicial: R$" + saldoInicial);
        System.out.println("Saldo atual: R$" + saldo);

        //movimentações
        System.out.println("Depósitos: " + depositos.getQuantidade() + " || " + "Total: R$" + depositos.getValorTotal());
        System.out.println("Saques: " + saques.getQuantidade() + " || " + "Total: R$" + saques.getValorTotal());
        System.out.println("Juros: " + juros.getQuantidade() + " || " + "Total: R$" + juros.getValorTotal());
        System.out.println("Saldo minimo: R$" + saldoMin);
        System.out.println("Saldo máximo: R$" + saldoMax);
    }
}