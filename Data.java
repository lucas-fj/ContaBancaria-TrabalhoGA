//**Classe com atributos da Data usada para saber a data de vencimento
// da ContaInvestimento e data de nascimento do cliente */

public class Data {
    
    //atributos
    private int dia;
    private int mes;
    private int ano;

    //getters e setters 
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    //construtor
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    //método toString para formatar e mostrar a data
    @Override
    public String toString() {
        return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
    }
}