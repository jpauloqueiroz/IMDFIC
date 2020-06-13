package Prog_Orientada_a_Objetos.aula04;

public class Main{

    public static void main(String[] args){

        Carro meuCarro = new Carro();

        meuCarro.setCor("preto");
        meuCarro.setNumPortas(4);
        meuCarro.setPlaca("MHX 1234");
        meuCarro.setTipo("esportivo");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Camila");
        pessoa.setIdade(27);
        pessoa.setCarro(meuCarro);

        pessoa.ligarCarro();
        pessoa.setCambioCarro(1);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(2);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(3);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(2);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(1);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(0);
        pessoa.frearCarro();
        pessoa.desligarCarro();


    }
}