package Prog_Orientada_a_Objetos.aula08;

public class Transporte {
    private int capacidade;

    protected Transporte(int capacidade){
        super();
        this.capacidade = capacidade;
    }

    protected int getCapacidade(){
        return capacidade;
    }

    protected void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

}
