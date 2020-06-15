package Prog_Orientada_a_Objetos.aula06;

public class Main {
    public static void main(String[] args) {
        //CASO 1
        Automovel automovel = new Automovel();
        //ou
        //Automovel automovel = new Automovel(1600);

        //CASO 2
        //Automovel automovel = new Automovel();
        automovel.ligarPrimeiraVez();
        //outra maneira
        automovel.ligarPrimeiraVez(1600);

        //CASO 3
        //Automovel automovel = new Automovel();
        Motor motor = new Motor();
        //outra maneira
        //Motor motor = new Motor (1600);
        automovel.setMotor(motor);
    }
}

