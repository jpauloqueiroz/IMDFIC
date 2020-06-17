package Prog_Orientada_a_Objetos.aula08;

public class Main {
    public static void main(String[] args) {

        Automovel automovel = new Automovel();
        automovel.setCapacidade(100000);
        automovel.setNumRodas(6);
        System.out.println(automovel.getNumRodas());
    }
}
