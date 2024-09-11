/*
 Crie uma classe main que instancia todas as classes que implementam a interface e chame os métodos
*/

public class ContaMain {
  public static void main(String[] args) {
    ContaInvest contaInvestimento = new ContaInvest();
    contaInvestimento.saque();
    contaInvestimento.extrato();
    contaInvestimento.pix();

    ContaCor contaCorrente = new ContaCor();
    contaCorrente.saque();
    contaCorrente.extrato();
    contaCorrente.pix();
  }


}


