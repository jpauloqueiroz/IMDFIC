package Prog_Orientada_a_Objetos.aula05;

public class Main {
    public static void main(String[] args) {

        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();

        agenda1.anote(12, 10, "Dia da Criança");
        agenda2.anote(7, 15, "Independência do Brasil");

        agenda1.mostraAnotacao();
        agenda2.mostraAnotacao();

    }
}
