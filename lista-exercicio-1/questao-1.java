/*

### **Questão 1: Conceito de Encapsulamento e Information Hiding**

Explique o conceito de encapsulamento e como ele está relacionado ao princípio de Information Hiding. Por que é importante utilizar esses conceitos em projetos de software?

Encapsulamento é um pilar da programação orientada a objetos (POO) e outras metodologias. Seria o conceito de você fechar em escopos o que pode ou não ser acessado em outras partes do código, quando você compartilhar o componente de código com outras partes do programa.

De maneira geral, o Encapsulamento agrupa dados/atributos e métodos/funções que operam sobre esses dados dentro de uma única unidade, como uma classe ou componente ou módulo. O encapsulamento permite que os detalhes internos “dessa” classe sejam escondidos do “mundo exterior”, expondo apenas o que é necessário através de interfaces e métodos públicos definidos para tal (ex: manipulação e leitura dos dados).

Além de reduzir a complexidade do código, facilitar a manutenção e reutilização de código. Um dos objetivos do encapuslamento é proteger os dados internos da classe e controlar o acesso a eles. O que vai de encontro ao conceito de information hidden, que se refere a ocultação de detalhes internos de uma implementação, de modo que os usuários de uma classe ou módulo não precisam saber como algo está funcionando por dentro, mas apenas como interagir com ele.

É importante usar esses conceitos em engenharia de software, porque quando o encapsulamento restringe o acesso direto aos dados, expondo apenas o que é necessário através de métodos específicos (ex: famosos _getters_ e _setters_, como no Java ou C). Isso garante que a manipulação dos dados internos ocorra de maneira controlada, previsível e muito mais segura.

Um exemplo de encapsulamento, ainda que de maneira diferente de linguagens orientadas a objetos, seriam componentes e hooks na biblioteca JavaScript React, onde toda lógica e estados (dados) podem ficar internalizadas dentro do escopo deles e estes componentes e hooks podem ser reutilizado em qualquer parte do programa, expondo props (métodos) para manipular os estados ou interagir com eles, mas sem a possibilidade de quebrar a lógica de seu funcionamento interno ou até mesmo obter os dados, a não ser que você exponha pelas props.

RESPOSTA PROFESSOR =

1.1 como encapsulamento se relaciona com information hiding?

- encapsulamento é um técnica de information hiding.
- no encapsulamento eu guardo as variáveis da classe e forneço os métodos para que os usuários manipulem as variáveis.

  1.2 pq utilizar information hiding?

- isolando dados sensíveis código tende a se tornar mais seguros
- pq facilita a reutilização dos métodos
- minima a chance de ocorrer separação de responsabilidades
- ADD - previsibilidade e controle
*/