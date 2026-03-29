//**Classe principal para rodar o projeto*/

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = null; //objeto conta bancária criado como null
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

                    //recebendo saldo inicial e tipo de conta
                    double saldo = Teclado.leDouble("Informe o saldo inicial: ");
                    char tipo = Teclado.leChar("Escolha o tipo de conta, Corrente(C), Poupança(P) ou Investimento(I): ");

                    if (tipo == 'C') {
                        double limite = Teclado.leDouble("Informe o limite:");
                        conta = new ContaCorrente(cliente, saldo, null, null, null, limite);
                    } else if (tipo == 'P') {
                        int diaAniversario = Teclado.leInt("Informe o dia aniversário: ");
                        conta = new ContaPoupanca(cliente, saldo, null, null, null, diaAniversario);
                    } else if (tipo == 'I') {
                        System.out.println("Data de vencimento: ");
                        int diaVencimento = Teclado.leInt("Dia: ");
                        int mesVencimento = Teclado.leInt("Mês: ");
                        int anoVencimento = Teclado.leInt("Ano: ");
                        Data dtVencimento = new Data(diaVencimento, mesVencimento, anoVencimento);
                        conta = new ContaInvestimento(cliente, saldo, null, null, null, dtVencimento);
                    }
                    break;

                case 2: 
                //**CONTINUAR A PARTIR DO CASO 2 (DEPOSITO) PRECISA SER FEITO METODOS NAS CLASSES PARA CONTAR DEPOSITOS E ADD O DINHEIRO **/
            
                default:
                    break;
            }
        }
    }
}