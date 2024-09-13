/*

# Exercício: Herança vs Composição, Classes vs Interfaces em Java

https://docs.google.com/document/d/1gp-vGHY14kWiaTAchaN4YOXr570kX-GUZR2EYiYelEQ/edit

Imagine que você está desenvolvendo um sistema para gerenciar um serviço de entrega de encomendas. No sistema, temos dois tipos principais de entregadores: Entregador de Bicicleta e Entregador de Carro.

Cada entregador tem atributos em comum, como nome, distância percorrida e capacidade de carga. No entanto, entregadores de bicicleta têm uma capacidade de carga menor e não precisam se preocupar com nível de combustível, enquanto os entregadores de carro têm uma capacidade maior, mas precisam gerenciar o consumo de combustível.

Agora, sua tarefa é modelar essa situação pensando nas vantagens de usar herança ou composição. Além disso, considere quando seria mais adequado utilizar classes abstratas ou interfaces para definir comportamentos.

## Pergunta:
Implemente as classes necessárias para o sistema de Entrega considerando as seguintes perguntas:

- Como você modelaria os atributos e comportamentos compartilhados entre os dois tipos de entregadores? Você utilizaria herança ou composição? Justifique sua escolha.
- Ao definir os comportamentos dos entregadores, como calcular a distância percorrida ou a capacidade de carga, você optaria por usar classes abstratas ou interfaces? Explique quando cada uma dessas opções seria mais adequada no contexto do exercício.

## Dica:
A herança permite compartilhar código, mas pode introduzir um acoplamento forte.
A composição permite uma estrutura mais flexível, onde objetos podem ser compostos de outros objetos.
Classes abstratas permitem que métodos comuns tenham uma implementação compartilhada, mas limitam a herança a uma única classe.
Interfaces permitem que várias classes compartilhem comportamentos sem precisar de uma relação hierárquica.

*/

// interface Entregador
interface Entregador {
    String nome = "";
    int distanciaPercorrida = 0;
    int capacidadeCarga = 0;

    void entregarEncomenda(int distancia);
}

// interface Combustivel
interface Combustivel {
  int nivelCombustivel = 0;
  void gerenciarCombustivel();
}

// classe EntregadorBicicleta
class EntregadorBicicleta implements Entregador {
    String nome;
    int distanciaPercorrida;
    int capacidadeCarga;

    public EntregadorBicicleta(String nome, int capacidadeCarga) {
        this.nome = nome;
        this.capacidadeCarga = capacidadeCarga;
    }

    public void entregarEncomenda(int distancia) {
        this.distanciaPercorrida += distancia;
    }
}



// classe EntregadorCarro, aqui decidimos usar o conceito de composição, onde a classe EntregadorCarro implementa as interfaces Entregador e Combustivel
class EntregadorCarro implements Entregador, Combustivel {
    String nome;
    int distanciaPercorrida;
    int capacidadeCarga;
    int nivelCombustivel;

    public EntregadorCarro(String nome, int capacidadeCarga, int nivelCombustivel) {
        this.nome = nome;
        this.capacidadeCarga = capacidadeCarga;
        this.nivelCombustivel = nivelCombustivel;
    }

    public void entregarEncomenda(int distancia) {
        this.distanciaPercorrida += distancia; // aqui estamos simulando a entrega de uma encomenda, ou seja, a distância percorrida aumenta de acordo com a distância da entrega
    }

    public void gerenciarCombustivel() {
        this.nivelCombustivel -= 1; // aqui estamos simulando o consumo de combustível, ou seja, a cada entrega o nível de combustível diminui em 1
    }
}

// classe Main
public class Main {
    public static void main(String[] args) {

       // definindo os entregadores
        EntregadorBicicleta entregadorBicicleta = new EntregadorBicicleta("Lucas", 10);
        EntregadorCarro entregadorCarro = new EntregadorCarro("Sanches", 20, 100);

        entregadorBicicleta.entregarEncomenda(5);
        entregadorCarro.entregarEncomenda(10);
        entregadorCarro.gerenciarCombustivel();


        // entregador Bike
        System.out.println("Entregador Bike - Nome: " + entregadorBicicleta.nome);
        System.out .println("Entregador Bike - Capacidade de carga: " + entregadorBicicleta.capacidadeCarga);
        System.out.println("Entregador Bike - Distância percorrida: " + entregadorBicicleta.distanciaPercorrida);

        // entregador Carro
        System.out.println("Entregador Carro - Nome: " + entregadorCarro.nome);
        System.out.println("Entregador Carro - Capacidade de carga: " + entregadorCarro.capacidadeCarga);
        System.out.println("Entregador Carro - Distância percorrida: " + entregadorCarro.distanciaPercorrida);
        System.out.println("Entregador Carro - Nível de combustível: " + entregadorCarro.nivelCombustivel);
    }
}