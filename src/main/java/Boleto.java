
public class Boleto {

  private double valor;
  private String vencimento;
  private String codigoDeBarras;

  // varáveis private: não posso escrever os dados em variáveis privadas por outra classe, mas posso ler. ou seja, posso acessar os dados, mas não posso alterá-los.

  public void emitirBoleto(double valor, String vencimento, String codigoDeBarras) {
    System.out.println("Emitindo boleto... Valor: " + valor + " | Vencimento: " + vencimento + " | Código de barras: " + codigoDeBarras);

    Boleto b = new Boleto();
    b.valor = valor;
    b.vencimento = vencimento;
    b.codigoDeBarras = codigoDeBarras;

    Impressora i = new Impressora();
    i.imprimir(b);


  }

  // aqui vamos criar métodos para acessar os dados privados, mas não para alterá-los
  public String getCodigoDeBarras() {
    return codigoDeBarras;
  }
  public double getValor() {
    return valor;
  }
  public String getVencimento() {
    return vencimento;
  }

  public void cancelarBoleto() {
    System.out.println("Cancelando boleto...");
  }

  public void receberBoleto() {
    System.out.println("Recebendo boleto...");
  }

}