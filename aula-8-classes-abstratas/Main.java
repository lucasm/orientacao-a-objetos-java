/*
 EXERCÍCIO:

Você está desenvolvendo um sistema bancário no qual diferentes tipos de contas bancárias (Corrente, Poupança, Investimento) têm comportamentos específicos, mas também compartilham alguns comportamentos comuns.

- Crie uma classe abstrata `ContaBancaria` com atributos e métodos comuns como `numeroConta`, `saldo`, `depositar()` e `sacar()`. Defina um método abstrato `calcularTarifa()` que será implementado pelas subclasses, pois cada tipo de conta tem uma tarifa diferente.

Implemente as subclasses `ContaCorrente`, `ContaPoupanca` e `ContaInvestimento`. Cada uma deve implementar o método `calcularTarifa()` com uma lógica específica.

Crie uma classe de teste que: 1) Instancie objetos dessas contas. 2) Deposite e saque valores. 3) Calcule as tarifas específicas de cada conta.

Reflexão: Explique por que o uso de uma classe abstrata foi apropriado neste caso, e quais vantagens ela traz em termos de organização e reuso de código.
*/

// Classe abstrata
abstract class ContaBancaria {
  private int numeroConta;
  protected double saldo;

  public ContaBancaria(int numeroConta, double saldo) {
      this.numeroConta = numeroConta;
      this.saldo = saldo;
  }

  public void depositar(double valor) {
      saldo += valor;
  }

  public void sacar(double valor) {
      saldo -= valor;
  }


  // aqui definimos um método abstrato, que será implementado nas subclasses
  public abstract void calcularTarifa();
}

// Subclasses
class ContaCorrente extends ContaBancaria {
  public ContaCorrente(int numeroConta, double saldo) {
      super(numeroConta, saldo);
  }

  // aqui implementamos o método abstrato calcularTarifa
  @Override
  public void calcularTarifa() {
      saldo -= 30;
  }
}

class ContaPoupanca extends ContaBancaria {
  public ContaPoupanca(int numeroConta, double saldo) {
      super(numeroConta, saldo);
  }

  @Override
  public void calcularTarifa() {
      saldo -= 10;
  }
}

class ContaInvestimento extends ContaBancaria {
  public ContaInvestimento(int numeroConta, double saldo) {
      super(numeroConta, saldo);
  }

  @Override
  public void calcularTarifa() {
      saldo -= 20;
  }
}

// Classe de teste, onde instanciamos objetos das contas e testamos os métodos, como depositar, sacar e calcularTarifa
public class Main {
  public static void main(String[] args) {
      ContaCorrente cc = new ContaCorrente(123, 1000);
      ContaPoupanca cp = new ContaPoupanca(456, 2000);
      ContaInvestimento ci = new ContaInvestimento(789, 3000);

      cc.depositar(500);
      cc.sacar(200);
      cc.calcularTarifa();

      cp.depositar(1000);
      cp.sacar(500);
      cp.calcularTarifa();

      ci.depositar(1500);
      ci.sacar(1000);
      ci.calcularTarifa();

      System.out.println("Saldo da conta corrente: R$" + cc.saldo);
      System.out.println("Saldo da conta poupança: R$" + cp.saldo);
      System.out.println("Saldo da conta investimento: R$" + ci.saldo);
  }
}


