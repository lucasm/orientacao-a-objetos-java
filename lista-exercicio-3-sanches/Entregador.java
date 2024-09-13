//Classe abstrata para Entregadores
abstract class Entregador {
    protected String nome;
    protected double distanciaPercorrida;
    protected double capacidadeCarga;
    
    public Entregador(String nome, double capacidadeCarga) {
        this.nome = nome;
        this.capacidadeCarga = capacidadeCarga;
        this.distanciaPercorrida = 0;
    }
    
    //Métodos comuns
    public void adicionarDistancia(double distancia) {
        this.distanciaPercorrida += distancia;
    }
    
    public abstract double calcularCapacidadeCarga();
}