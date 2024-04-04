
public class Boleto {

  double valor;
  String vencimento;
  String codigoDeBarras;

  public void emitirBoleto( double valor, String vencimento, String codigoDeBarras) {
    System.out.println("Emitindo boleto... Valor: " + valor + " | Vencimento: " + vencimento + " | Código de barras: " + codigoDeBarras);

    Boleto b = new Boleto();
    b.valor = valor;
    b.vencimento = vencimento;
    b.codigoDeBarras = codigoDeBarras;

    Impressora i = new Impressora();
    i.imprimir(b);


  }

  public void cancelarBoleto() {
    System.out.println("Cancelando boleto...");
  }

  public void receberBoleto() {
    System.out.println("Recebendo boleto...");
  }

  private class AulaHoje {}

}