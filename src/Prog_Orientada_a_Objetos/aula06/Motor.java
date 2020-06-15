package Prog_Orientada_a_Objetos.aula06;

public class Motor {
    private int potencia;

    public Motor() {
        this.potencia = 1000;
    }

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia(){
        return this.potencia;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
}
