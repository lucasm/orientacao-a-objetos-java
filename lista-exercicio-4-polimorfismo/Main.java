// Definindo a interface Lista com o método adicionar
interface Lista<T> {
  void adicionar(T elemento);
}

// Implementação da classe ListaSequencial que implementa a interface Lista
class ListaSequencial<T> implements Lista<T> {
  // ArrayList para armazenar os elementos internamente
  private java.util.List<T> elementos;

  // Construtor da classe inicializando o array interno
  public ListaSequencial() {
      this.elementos = new java.util.ArrayList<>();
  }

  // Implementação do método adicionar da interface Lista
  @Override
  public void adicionar(T elemento) {
      elementos.add(elemento); // Adiciona o elemento ao array interno
  }

  // Método adicional para exibir os elementos (opcional)
  public void mostrarElementos() {
      System.out.println(elementos);
  }
}

// Código para testar a implementação
public class Main {
  public static void main(String[] args) {
      Lista<String> alunos = new ListaSequencial<>();

      alunos.adicionar("João");
      alunos.adicionar("Maria");
      alunos.adicionar("José");

      // Exibindo os elementos adicionados (opcional)
      ((ListaSequencial<String>) alunos).mostrarElementos(); // Exibe: [João, Maria, José]
  }
}
