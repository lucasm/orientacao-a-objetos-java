public class Itau implements Pagamento {
  @Override
  public void processarPagamento() {
      System.out.println("Pagamento realizado via Itau.");
  }
}