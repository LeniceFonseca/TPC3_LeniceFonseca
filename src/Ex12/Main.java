package Ex12;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Criação de tarefas
        TarefaUnica tarefaUnica = new TarefaUnica("Comprar pão", LocalDate.of(2023, 4, 25));
        TarefaDiaria tarefaDiaria = new TarefaDiaria("Fazer exercícios", LocalDate.of(2023, 4, 20));
        TarefaMensal tarefaMensal = new TarefaMensal("Pagar contas", LocalDate.of(2023, 4, 10), 10);

        TarefasCollection tarefasCollection = new TarefasCollection();

    }

}


