/*
 ATIVIDADE: ATIVIDADE: Criar um “método de pagamento universal”, que aceita todos os tipos de pagamento (Nubank, Picpay, Itau) menos o tipo de pagamento Elo, esse deve dar erro. Usar Polimorfismo. Lembre no Polimorfismo aceitamos um grupo de classes. Usar interface. Sem ifs.

*/

// Testando o sistema
public class Main {
  public static void main(String[] args) {
      Maquininha processador = new Maquininha();

      Pagamento nubank = new Nubank();
      Pagamento picpay = new Picpay();
      Pagamento itau = new Itau();
      // Pagamento elo = new Elo(); // aqui

      processador.processar(nubank);  // Pagamento realizado via Nubank.
      processador.processar(picpay);  // Pagamento realizado via Picpay.
      processador.processar(itau);    // Pagamento realizado via Itau.

      // Vai lançar uma exceção
      // processador.processar(elo);     // Exception: Pagamento via Elo não é suportado.
  }
}

