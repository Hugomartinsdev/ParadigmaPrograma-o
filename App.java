//import java.util.*;
//import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Scanner sc_String = new Scanner(System.in);

        int menu,con;
        Contato objContato;
        String nome, sexo, telefone, email;
        con=0;

        do{
            exibeMenu();
            menu = sc.nextInt();

            switch (menu) {
                case 1: //Cadastro contato

                System.out.println("Cadastrar Contato");
                System.out.println("Digite o nome do contato");
                nome = sc_String.next();

                System.out.println("Digite o sexo do contato");
                sexo = sc_String.next();

                System.out.println("Digite o telefone do contato");
                telefone = sc_String.next();

                System.out.println("Digite o email do contato");
                email = sc_String.next();

                con=con+1;


                objContato = new Contato(nome, sexo, telefone, email,con);

                Agenda.adicionarContato(objContato);
                    
                    break;
                case 2: //Editar Contato

                System.out.println("Editar Contato");
                System.out.println("Digite o nome do Contato a ser alterado.");
                nome = sc_String.next();

                System.out.println("Digite o novo nome do Contato");
                String novoNome = sc_String.next();

                System.out.println("Digite o novo sexo do Contato");
                String novoSexo = sc_String.next();

                System.out.println("Digite o novo telefone do Contato");
                String novoTelefone = sc_String.next();

                System.out.println("Digite o novo email do Contato");
                String novoEmail = sc_String.next();


                objContato = new Contato(novoNome, novoSexo, novoTelefone, novoEmail,con);

                Agenda.editar(nome, objContato);

                    break;
            
                case 3: //Excluir Contato

                System.out.println("Excluir Contato");

                System.out.println("Digite o nome do Contato a ser deletado.");
                nome = sc_String.nextLine();

                if (!Agenda.getListaContato().isEmpty()){
                    if(Agenda.remover(nome)){
                        System.out.println("Contato removido com sucesso");
                    }else{
                        System.out.println("Contato não encontrado");
                    }
                }else{
                    System.out.println("Não existem contatos");
                }

                    break;

                case 4: //listar contatos

                System.out.println("Lista de Contatos");
                System.out.println(Agenda.listar());

                case 5:
                System.out.println("Saindo da Agenda de Contatos");

                    break;
                default:

                System.out.println("Opção Inválida");
                    break;
            }

        }while(menu != 5);


    }

    static void exibeMenu() {
        System.out.println("########Agenda#######");
        System.out.println("1 - Cadastre um novo Contato");
        System.out.println("2 - Editar um Contato");
        System.out.println("3 - Excluir um Contato");
        System.out.println("4 - Consultar Contatos");
        System.out.println("5 - Sair da Agenda");
    }
}
