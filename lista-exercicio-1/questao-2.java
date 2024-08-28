/*

## **Questão 2: Visibilidade de Atributos e Métodos**

Em Java, existem diferentes modificadores de visibilidade para atributos e métodos. Quais são esses modificadores, e qual o propósito de cada um deles? Dê exemplos de situações em que cada um deles seria mais adequado.

R =

### Modificadores de visibilidade no Java:

- public class: pode ser acessado de qualquer lugar
- public method: pode ser acessado de qualquer lugar
- public attr: pode ser acessado de qualquer lugar

- private attr: pode ser acessado apenas dentro da classe
- private method: pode ser acessado apenas dentro da classe
- private class: são classes que não permite herança


- protected:
- default:

*/


public class exemplo {
    public void m(){
      verificaUserLogado();
    }
}

private boolean verificaUserLogado(){
  return true;
}