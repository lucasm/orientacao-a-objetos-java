
public class Boleto {

  private double valor;
  private String vencimento;
  private String codigoDeBarras;

  // varáveis private: posso acessar os dados, mas não posso alterá-los por fora da classe

  // construtor: método especial que só existe no momento quando a classe é instanciada (chamada New) e cria o objeto
  public Boleto(double valor, String vencimento, String codigoDeBarras) {
    this.valor = valor;
    this.vencimento = vencimento;
    this.codigoDeBarras = codigoDeBarras;
  }
  // this: é uma referência para o objeto que está instanciado, só pode ser usado dentro da própria classe

  public void emitirBoleto() {
    System.out.println("Emitindo boleto... Valor: " + valor + " | Vencimento: " + vencimento + " | Código de barras: " + codigoDeBarras);

    System.out.println(new Impressora());
    new Impressora().imprimir(this);


  }

  // aqui vamos criar métodos para acessar as variáveis de classe, que são privadas, não podemos alterá-los
  public String getCodigoDeBarras() {
    return codigoDeBarras;
  }
  public double getValor() {
    return valor;
  }
  public String getVencimento() {
    return vencimento;
  }

  public void setValorAposVencimento(int juros) {
    valor = valor + juros;
  }

  public void cancelarBoleto() {
    System.out.println("Cancelando boleto...");
  }

  public void receberBoleto() {
    System.out.println("Recebendo boleto...");
  }

}