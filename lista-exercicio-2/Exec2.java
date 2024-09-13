/*
Atividade 2

Sistema bancário com diferentes tipos de contas (Corrente e Poupança) e diferentes serviços que essas contas podem utilizar (Empréstimos e Cartão de Crédito).

- Herança:

Crie uma classe base ContaBancaria com atributos (numeroConta, saldo) e métodos (depositar e sacar). Crie subclasses ContaCorrente e ContaPoupanca que herdam de ContaBancaria. Adicione comportamentos específicos para cada tipo de conta, como taxas de manutenção para ContaCorrente ou rendimentos para ContaPoupanca.

- Composição:

Crie uma classe Cliente que possua informações como nome, cpf. Em vez de herdar de Cliente, a classe ContaBancaria deve possuir uma instância de Cliente. Isso modela o relacionamento "um cliente pode ter uma conta bancária".

- Decisão de Design:

Agora, você precisa criar um novo serviço: Empréstimo. Você deve decidir se Empréstimo deve ser uma subclasse de ContaBancaria (herança) ou se ContaBancaria deve ter uma instância de Empréstimo (composição).

*/


public class Exec2 {
  public static void main(String[] args) {
      Cliente cliente = new Cliente("João", "123.456.789-00");
      // ContaCor contaCorrente = new ContaCor(cliente, 1234, 1000);
      ContaPoupanca contaPoupanca = new ContaPoupanca(cliente, 5678, 500);

      // contaCorrente.depositar(100);
      // contaCorrente.sacar(50);
      // contaCorrente.calcularTaxaManutencao();
      // contaCorrente.solicitarEmprestimo(5000, 0.05);

      contaPoupanca.depositar(100);
      contaPoupanca.sacar(50);
      contaPoupanca.calcularRendimento();
  }
}

// Composição
class Cliente {
  private String nome;
  private String cpf;

  public Cliente(String nome, String cpf) {
      this.nome = nome;
      this.cpf = cpf;
  }
}

// Herança pai, ContaBancaria é a classe base
class ContaBancaria {
  private Cliente cliente; // Composição, instância de Cliente
  private int numeroConta;
  protected double saldo; // Visível nas subclasses
  private Emprestimo emprestimo; // Composição, instância de Empréstimo

  public ContaBancaria(Cliente cliente, int numeroConta, double saldo) {
      this.cliente = cliente;
      this.numeroConta = numeroConta;
      this.saldo = saldo;
  }

  public void depositar(double valor) {
      saldo += valor;
  }

  public void sacar(double valor) {
      if (valor <= saldo) {
          saldo -= valor;
      } else {
          System.out.println("Saldo insuficiente.");
      }
  }

  // aqui aconteceu uma decisão de design, optei por composição, pois Empréstimo é um serviço que ContaBancaria pode utilizar
  public void solicitarEmprestimo(double valorEmprestimo, double taxaJuros) {
      Emprestimo emprestimo = new Emprestimo(valorEmprestimo, taxaJuros);
      saldo += emprestimo.calcularTotalPagar();
      System.out.println("Empréstimo aprovado. Novo saldo: R$" + saldo);
  }
}

// Herança filho, pois ContaCorrente é um tipo de ContaBancaria
class ContaCorrente extends ContaBancaria {
  public ContaCorrente(Cliente cliente, int numeroConta, double saldo) {
      super(cliente, numeroConta, saldo);
  }

  public void calcularTaxaManutencao() {
      double taxa = 10.0;
      saldo -= taxa;
      System.out.println("Taxa de manutenção de R$10,00 debitada. Novo saldo: R$" + saldo);
  }
}

// Herança filho, pois ContaPoupanca é um tipo de ContaBancaria
class ContaPoupanca extends ContaBancaria {
  public ContaPoupanca(Cliente cliente, int numeroConta, double saldo) {
      super(cliente, numeroConta, saldo);
  }

  public void calcularRendimento() {
      double rendimento = 5.0;
      saldo += rendimento;
      System.out.println("Rendimento de R$5,00 creditado. Novo saldo: R$" + saldo);
  }
}

// Composição, pois Emprestimo é um serviço que ContaBancaria pode utilizar
class Emprestimo {
  private double valorEmprestimo;
  private double taxaJuros;

  public Emprestimo(double valorEmprestimo, double taxaJuros) {
      this.valorEmprestimo = valorEmprestimo;
      this.taxaJuros = taxaJuros;
  }

  public double calcularTotalPagar() {
      return valorEmprestimo + (valorEmprestimo * taxaJuros);
  }
}
