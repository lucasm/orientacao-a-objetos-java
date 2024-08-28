/*

### **Questão 4: Implementação Prática - Classe "Livro"**

Implemente uma classe Livro em Java com os seguintes atributos: titulo (título do livro), autor (nome do autor), e numeroPaginas (número de páginas).

- Todos os atributos devem ser privados.
- A classe deve possuir construtores para inicializar os objetos e métodos para exibir as informações do livro (exibirDetalhes).
- Implemente também os métodos getters e setters necessários.

*/

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // o construtor é um método especial chamado uma única vez, para instanciar um objeto, não é necessário passar atributos como parâmetros

    public void exibirDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numeroPaginas);
    }

    public String getTitulo() {
        return titulo;
    }

    // o set é um método que permite alterar o valor de um atributo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
