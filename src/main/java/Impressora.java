public class Impressora {

  public void imprimir(Boleto b) {
    System.out.println("Imprimindo boleto... Valor: " + b.valor + " | Vencimento: " + b.vencimento + " | Código de barras: " + b.codigoDeBarras);
  }

}