package Prog_Orientada_a_Objetos.aula04;

public class Pessoa {
    private int idade;
    private String nome;
    private Carro carro;

    void ligarCarro(){
        carro.ligar();
    }
    void desligarCarro(){
        carro.desligar();
    }
    void acelerarCarro(){
        carro.acelerar();
    }
    void frearCarro(){
        carro.frear();
    }
    void setCambioCarro(int marcha){
        carro.setCambio(marcha);
    }

    Carro getCarro(){
        return carro;
    }

    void setCarro(Carro carro){
        this.carro = carro;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    int getIdade(){return this.idade;}

    String getNome() {
        return this.nome;
    }
}
