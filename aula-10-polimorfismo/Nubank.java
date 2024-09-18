public class Nubank implements Pagamento {
  @Override
  public void processarPagamento() {
      System.out.println("Pagamento realizado via Nubank.");
  }
}