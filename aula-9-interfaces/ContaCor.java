public class ContaCor  implements Conta {

  // constructor
  public ContaCor() {
    System.out.println("Conta Cor criada!");
  }

  private double saldo = 30.0;
  private double limite = 1000.0;

  public void saque() {
    System.out.println("Conta Cor - Saque");
  }

  public void extrato() {
    System.out.println("Conta Cor - Extrato");
  }

  public void pix() {
    System.out.println("Conta Cor - Pix");
  }
}
