public class Picpay implements Pagamento {
  @Override
  public void processarPagamento() {
      System.out.println("Pagamento realizado via Picpay.");
  }
}