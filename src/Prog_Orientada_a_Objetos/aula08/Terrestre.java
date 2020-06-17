package Prog_Orientada_a_Objetos.aula08;

public class Terrestre extends Transporte{
    private int numRodas;

    protected Terrestre(int capacidade, int numRodas){
        super(capacidade);
        this.numRodas = numRodas;
    }

    protected int getNumRodas(){
        return numRodas;
    }

    protected void setNumRodas(int numRodas){
        this.numRodas = numRodas;
    }

}
