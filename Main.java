//**Classe principal para rodar o projeto*/

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = null;
        int opcao;

        do{
            opcao = Teclado.leInt("\n1- Abrir conta.\n2- Realizar depósito.\n3- Realizar saque.\n4- Aplicar juros.\n5- Extrato.\n6- Integrantes.\n7-Sair.");
            
            switch (opcao) {
                case 1:
                    //if para verificar se a conta ja foi criada (caso ja tenha sido opção 1 é bloqueada)
                    if (conta != null) {
                        break;
                    }

                    //recebendo dados do cliente
                    String nome = Teclado.leString("Nome: "); 
                    String cpf = Teclado.leString("CPF: ");
                    System.out.println("Digite sua data de nascimento.");
                    int dia = Teclado.leInt("Dia: ");
                    int mes = Teclado.leInt("Mês: ");
                    int ano = Teclado.leInt("Ano: ");

                    //criando o objeto cliente e objeto data
                    Cliente cliente = new Cliente(nome, cpf, new Data(dia, mes, ano));
                    break;
            
                default:
                    break;
            }
        }
    }
}
