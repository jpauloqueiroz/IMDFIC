package Prog_Orientada_a_Objetos.aula05;

class Agenda {
    private int dia;
    private int mes;
    private String anotacao;

    void anote(int dia, int mes, String nota){
        this.dia = dia;
        this.mes = mes;
        this.anotacao = nota;
        validaNota();
    }

    private void validaNota() {
        if((dia < 1) || (dia > 31) || (mes < 1) || (mes > 12)){
            this.dia = 0;
            this.mes = 0;
            this.anotacao = "anotação não inserida devido data inválida";
        }
    }

    void mostraAnotacao(){
        System.out.println(dia + "/" + mes + " : " + anotacao);
    }
}
