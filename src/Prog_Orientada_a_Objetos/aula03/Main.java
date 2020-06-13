package Prog_Orientada_a_Objetos.aula03;
/**
 *ClasseResponsavelPorExecutarONossoPrograma
 *
 * @author nome_do_autor
 *
 */
public class Main {
    public static void main (String[] args){
        Carro meuCarro = new Carro();
        meuCarro.setCor("preto");
        meuCarro.setNumPortas(4);
        meuCarro.setPlaca("MHX 1234");
        meuCarro.setTipo("esportivo");

        System.out.println("Cor: "+meuCarro.getCor());
        System.out.println("Número de portas: "+meuCarro.getNumPortas());
        System.out.println("Placa: "+meuCarro.getPlaca());
        System.out.println("Tipo: "+meuCarro.getTipo());

        System.out.println(meuCarro.teste);
        System.out.println(meuCarro.teste2);
	}
}
