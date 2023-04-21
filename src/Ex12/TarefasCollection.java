package Ex12;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class TarefasCollection {

    private List<Tarefa> tarefas;

    public TarefasCollection() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa) {
        this.tarefas.remove(tarefa);
    }

    public void modificarTarefa(Tarefa tarefa, String novaDescricao, LocalDate novaData) {
        tarefa.setDescricao(novaDescricao);
        tarefa.setData(novaData);
    }

}
