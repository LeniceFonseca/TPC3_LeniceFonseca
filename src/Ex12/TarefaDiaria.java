package Ex12;

import java.time.LocalDate;
import java.time.Month;

public class TarefaDiaria extends Tarefa {

    public TarefaDiaria(String descricao, LocalDate data) {
        super(descricao, data);
    }

    @Override
    public boolean ocorreEm(int year, Month month, int day) {
        return true;
    }
}
