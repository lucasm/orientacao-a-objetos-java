public class App {
  public void mandarPix(){}

  public void guardarDinheiroNoCofrinho(){}

  public void emitirBoleto(){
    System.out.println("Estou na classe APP e quero emitir boleto...");

    Boleto b = new Boleto(100.0, "10/10/2021", "123456789");
    b.emitirBoleto();

  }
}
