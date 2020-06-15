package Prog_Orientada_a_Objetos.aula06;

class Automovel{
    private Motor motor;
    private Direcao direcao;

    //--Caso-1----------------------------------------------------------------------------------------------------------
    public Automovel() {
        this.motor = new Motor(0);
        this.direcao = new Direcao();
    }

    public Automovel(int potencia) {
        this.motor = new Motor(potencia);
        this.direcao = new Direcao();
    }

    //--Caso-2----------------------------------------------------------------------------------------------------------
    public void ligarPrimeiraVez(){
        motor = new Motor();
    }

    public void ligarPrimeiraVez(int potencia){
        motor = new Motor(potencia);
    }

    //------------------------------------------------------------------------------------------------------------------

    public Motor getMotor(){
        return this.motor;
    }
    public void setMotor(Motor motor){
        this.motor = motor;
    }
    public Direcao getDirecao(){
        return this.direcao;
    }
    public void setDirecao(Direcao direcao){
        this.direcao = direcao;
    }
}
