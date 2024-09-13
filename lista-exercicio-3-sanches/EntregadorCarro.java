//Classe para Entregadores de Carro
class EntregadorCarro extends Entregador {
    double nivelCombustivel;
    
    public EntregadorCarro(String nome, double capacidadeCarga, double nivelCombustivel) {
        super(nome, capacidadeCarga);
        this.nivelCombustivel = nivelCombustivel;
    }

    @Override
    public double calcularCapacidadeCarga() {
        return capacidadeCarga;
    }
    
    public void consumirCombustivel(double distancia) {
        //Lógica de consumo de combustível com base na distância
        this.nivelCombustivel -= distancia * 0.1; // Exemplo de consumo de 0.1 litro por km
    }
}