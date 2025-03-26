import java.util.ArrayList;

public class Agenda {

    public static ArrayList<Contato> listaContato = new ArrayList<>();


    public static ArrayList<Contato> getListaContato() {
        return listaContato;
    }

    public static void adicionarContato(Contato cont){
        listaContato.add(cont);

    }

    public static String listar(){
        String saida = "";

        for (Contato cont: listaContato){
            saida += cont.imprimir() +"\n";
        }
        return saida;
    }

    public static boolean remover(String nome){
        for(Contato cont: listaContato){
            if(cont.getNome().equals(nome)){
                listaContato.remove(cont);
                return true;
            }
        }
        return false;
    }

    public static void editar(String nome, Contato contato){
        for(int i = 0; i < listaContato.size(); i++){
            if(listaContato.get(i).getNome().equals(nome)){
                listaContato.set(i, contato);
            }
        }
    }
  
}
