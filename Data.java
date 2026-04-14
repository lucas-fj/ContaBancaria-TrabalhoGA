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
        return dia + "/" + mes + "/" + ano;
    }

    //métodos para coferir se as datas são válidas 
    public static int conferirDia(int dia){
        while (true) {
            if (dia >= 1 && dia <= 31 ) {
                return dia;
            } else {
                System.out.println("Dia inválido! Digite novamente: ");
                dia = Teclado.leInt();
            }
         }
    }

    public static int conferirMes(int mes){
        while (true) {
            if (mes >= 1 && mes <= 12) {
                return mes;
            } else {
                System.out.println("Mês inválido! Digite novamente: ");
                mes = Teclado.leInt();
            }
        }
    }

    public static int conferirAno(int ano){
        while (true) {
            if (ano <= 2026 && ano >= 1909) {
                return ano;
            } else {
                System.out.println("Ano inválido! Digite novamente: ");
                ano = Teclado.leInt();
            }
        }
    }
}