
// Implementação da interface Aluguel
public class APredio implements Aluguel {
  public void usoDaAreaComum() {
    System.out.println("A área comum pode ser utilizada por todos os moradores");
  }

  public void horarioParaReformas() {
    System.out.println("As reformas podem ser feitas das 8h às 18h");
  }

  public void usoDeAnimaisDeEstimacao() {
    System.out.println("Animais de estimação são bem vindos");
  }
}