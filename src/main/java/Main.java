// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {

  public static void main(String[] args) {

    Boleto b = new Boleto();

    b.emitirBoleto(100.0, "10/10/2022", "123456789");
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}