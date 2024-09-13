//Classe para Entregadores de Bicicleta
class EntregadorBicicleta extends Entregador {
    
    public EntregadorBicicleta(String nome) {
        super(nome, 15); //Capacidade de carga menor para bicicleta
    }

    @Override
    public double calcularCapacidadeCarga() {
        return capacidadeCarga;
    }
}