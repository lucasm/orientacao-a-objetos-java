public class Impressora {

  public void imprimir(Boleto b) {
    System.out.println("Imprimindo boleto... Valor: " + b.getValor() + " | Vencimento: " + b.getVencimento() + " | Código de barras: " + b.getCodigoDeBarras());
  }

}