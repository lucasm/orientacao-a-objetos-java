public class Main {
    public static void main(String[] args) {
        //Instanciando um Entregador de Bicicleta
        EntregadorBicicleta entregadorBicicleta = new EntregadorBicicleta("João");
        entregadorBicicleta.adicionarDistancia(10); // Adicionando distância percorrida
        System.out.println("Entregador de Bicicleta: " + entregadorBicicleta.nome);
        System.out.println("Distância percorrida: " + entregadorBicicleta.distanciaPercorrida + " km");
        System.out.println("Capacidade de carga: " + entregadorBicicleta.calcularCapacidadeCarga() + " kg");
        
        System.out.println("---------------------------");
        
        //Instanciando um Entregador de Carro
        EntregadorCarro entregadorCarro = new EntregadorCarro("Maria", 50, 20); // Capacidade maior e combustível inicial
        entregadorCarro.adicionarDistancia(20); // Adicionando distância percorrida
        entregadorCarro.consumirCombustivel(20); // Consome combustível com base na distância percorrida
        System.out.println("Entregador de Carro: " + entregadorCarro.nome);
        System.out.println("Distância percorrida: " + entregadorCarro.distanciaPercorrida + " km");
        System.out.println("Capacidade de carga: " + entregadorCarro.calcularCapacidadeCarga() + " kg");
        //Para fins de exemplo, vamos exibir o nível de combustível restante
        System.out.println("Combustível restante: " + entregadorCarro.nivelCombustivel + " litros");
    }
}