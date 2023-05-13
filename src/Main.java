import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Scanner leiaString = new Scanner(System.in);

        int menu = 1;
        int numero = 0;
        int cont = 0;
        String matricula;
        double salarioMedia=0;
        Boolean busca = false;


        Funcionario [] listaFuncionario = new Funcionario[10];

        while(menu != 0){

            exibeMenu();
            System.out.print("DIGITE A OPÇÂO: >> ");
            menu = leia.nextInt();

            if(menu == 1) {
                System.out.println("---------CADASTRO DE FUNCIONARIO--------");

                Funcionario funcionario = new Funcionario();

                System.out.print("NOME: ");
                funcionario.setNome(leiaString.nextLine());

                numero = numero +1;
                matricula = String.valueOf(numero);
                funcionario.setMatricula(matricula);

                System.out.print("SALARIO: ");
                funcionario.setSalario(leia.nextDouble());
                salarioMedia += funcionario.getSalario();

                listaFuncionario [cont] = funcionario;
                cont++;
            }
            else if(menu ==2 ){
                System.out.println("---------LISTA DE FUNCIONARIOS-------");
                if(listaFuncionario[0] != null) {
                    for (Funcionario leiaFuncionario : listaFuncionario) {
                        if(leiaFuncionario != null) {
                            System.out.println(leiaFuncionario.imprimir());
                        }
                    }
                }else{
                    System.out.println("Nenhum Funcionario cadastrado!!\n");
                }
            }
            else if(menu == 3){
                System.out.println("");
                System.out.print("Infome a matricula do funcionario: >> ");
                matricula = leiaString.next();
                for (Funcionario funcionario : listaFuncionario){
                    if (funcionario != null && matricula .equals(funcionario.getMatricula())){
                        System.out.println(funcionario.imprimir());
                        busca = true;
                    }
                }if(!busca){
                    System.out.println("Matricula nao encontrada!"+"\n");
                }
            }
            if(menu == 4){
                System.out.println("--------MEDIA SALARIAL--------");
                        System.out.println(String.format("Media Salarial R$ %.2f",salarioMedia/numero));
                    }

        }
    }


    static void exibeMenu (){
        System.out.println("==========MENU==========");
        System.out.println("1 - Cadastrar funcionario");
        System.out.println("2 - Listar funcionarios");
        System.out.println("3 - Procurar funcionario");
        System.out.println("4 - Exibe media Salarial");
        System.out.println("0 - Sair do programa");
    }
}