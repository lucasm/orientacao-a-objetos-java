public class ContaInvest implements Conta {

  // constructor
  public ContaInvest() {
    System.out.println("Conta Invest criada!");
  }

  private double saldo = 20.0;
  private double limite = 1000.0;

  public void saque() {
    System.out.println("Conta Invest - Saque");
  }

  public void extrato() {
    System.out.println("Conta Invest - Extrato");
  }

  public void pix() {
    System.out.println("Conta Invest - Pix");
  }
}

