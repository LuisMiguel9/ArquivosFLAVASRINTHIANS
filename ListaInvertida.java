import java.util.Hashtable;
import java.util.LinkedList;

public class ListaInvertida {
    private Hashtable<String, LinkedList<String>> tabela = new Hashtable<>();

    public ListaInvertida(){
        tabela = new Hashtable<>();
    }

    public boolean insere(String s, String documento){
        LinkedList<String> documentos = tabela.get(s);

        if(documentos != null){
            if(documentos.contains(documento)){
                return false;
            }
            else{
                documentos.add(documento);
                return true;
            }
        }
        else{
            LinkedList<String> nLista = new LinkedList<>();
            nLista.add(documento);
            tabela.put(s,nLista);
            return true;
        }
    }
    public LinkedList<String> busca(String s){
        return tabela.get(s);
    }
    public String toString(){
        return tabela.toString();
    }

}
