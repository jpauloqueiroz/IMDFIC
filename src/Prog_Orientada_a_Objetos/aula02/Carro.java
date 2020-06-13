package Prog_Orientada_a_Objetos.aula02;

public class Carro {
    String tipo;
    String cor;
    String placa;
    int numPortas;

    void setCor(String c){
        cor = c;
    }

    String getCor(){
        return cor;
    }

    String getTipo(){
        return tipo;
    }

    void setTipo(String tipo){
        this.tipo = tipo;
    }

    String getPlaca(){
        return placa;
    }

    void setPlaca(String placa){
        this.placa = placa;
    }

    int getNumPortas(){
        return numPortas;
    }
    void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }
}
