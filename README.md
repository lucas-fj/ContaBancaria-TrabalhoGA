# Sistema Bancário Simplificado
Este projeto foi desenvolvido como trabalho acadêmico para a disciplina de Programação Orientada a Objetos com o objetivo de aplicar seus conceitos usando a linguagem Java.

O sistema simula operações básicas de contas bancárias através de um menu interativo no terminal.

# Funcionalidades 
- Criar conta bancária (podendo ser do tipo conta corrente, poupança ou investimento)
- Realizar depósitos
- Realizar saques (com cálculo de notas que foram entregues)
- Aplicar juros (quando o tipo de conta for compatível) 
- Visualizar os extrato da conta completo
- Controle de saldo mínimo e máximo
- Registro de movimentações (quantidade total e valor)

# Estrutura do projeto
O sistema é dividido em classes com responsabilidades bem definidas:

## Classe Cliente
Armazena os dados principais do cliente:
- Nome
- CPF
- Data de nascimento

## Classe Data
Responsável por receber e validar as datas

## Classe abstrata ContaBancaria
Classe base que define:
- Saldo
- Movimentações (depósitos, saques e juros)
- Método abstrato movimenta()

  ## Classes de cada tipo de conta
  - ContaCorrente: Possui limite de crédito e permite saque com uso do limite
  - ContaPoupanca: Possui dia de aniversário, permite saque apenas com saldo disponível e permite aplicação de juros
  - ContaInvestimento: Possui data de vencimento e permite apenas depósitos e aplicação de juros

  ## Classe Movimentacao
  Controla a quantidade de operações e valor total movimentado na conta

  ## Classe Operação
  Representa as operações (D, S, J) e o valor

  ## Classe Teclado
  Classe usada para leitura de dados via terminal (adaptada para o uso no projeto)

  ## Classe Main
  Classe principal com menu interativo:

  1 - Abrir conta
  2 - Depositar
  3 - Sacar
  4 - Aplicar juros
  5 - Extrato
  6 - Integrantes
  7 - Sair

  # Como executar
  1.Compile os arquivos:
    javac *.java
  
  2.Execute o programa:
    java Main

  # Observações
  - Projeto desenvolvido para fins acadêmicos
  - Execução via terminal (console)
  - Dados armazenados em memória (sem banco de dados)
  - Classe Teclado adaptada para entrada de dados
