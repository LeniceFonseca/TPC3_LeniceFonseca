package Ex12;

import java.time.LocalDate;
import java.time.Month;

public class TarefaUnica extends Tarefa {

    boolean concluida;

    public TarefaUnica(String descricao, LocalDate data) {
        super(descricao, data);
    }

    @Override
    public boolean ocorreEm(int year, Month month, int day) {
        return super.ocorreEm(year, month, day) && !concluida;
    }
}
