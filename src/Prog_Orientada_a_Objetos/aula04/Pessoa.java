package Prog_Orientada_a_Objetos.aula04;

public class Pessoa {
    int idade;
    String nome;
    Carro carro;

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

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
