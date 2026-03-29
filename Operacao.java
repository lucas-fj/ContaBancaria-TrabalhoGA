//**Essa classe contém os atributos (tipo e valor) do método movimenta()
// criado na classe ContaBancaria */

public class Operacao {
    
    //atributos
    private char tipo;
    private double valor;

    //getters e setters
    public char getTipo() {
        return tipo;
    }
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    //construtor
    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor; 
    }
    

    //*FAZER MAIS MÉTODOS CASO SEJA NECESSÁRIO */
    
}
