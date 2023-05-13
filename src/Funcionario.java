public class Funcionario extends Pessoa{

    private double salarioMedia;

    public String imprimir () {
        return  "NOME:" + getNome() + " MATRICULA " + getMatricula() +
                " SALARIO: R$" + getSalario();
    }



}
