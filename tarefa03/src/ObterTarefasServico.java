
import java.util.ArrayList;
import java.util.List;

public class ObterTarefasServico {


    public List<String> obterTodos(){
        List<String> lista = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            lista.add("Tarefa "+i);
        }
        return lista;
    }

}
