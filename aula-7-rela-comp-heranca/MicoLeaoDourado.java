public class MicoLeaoDourado extends Macaco {

  public static void main(String[] args) {
    new MicoLeaoDourado().comer();

  }

  @Override
  public void dormir() {
    System.out.println("Estou dormindo em árvores como mico leão dourado");
  }

  @Override
  // @Override é uma anotação que indica que o método está sobrescrevendo um método da superclasse, por herança, contudo cuidado
  public void comer() {
    System.out.println("Estou comendo devagar, como mico leão dourado");
  }



  public void serPapelMoeda() {
    System.out.println("Sou papel moeda");
  }
}