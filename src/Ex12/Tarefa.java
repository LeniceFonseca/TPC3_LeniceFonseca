package Ex12;
import java.time.LocalDate;
import java.time.Month;

public class Tarefa {

    private String descricao;
    private LocalDate data;

    public Tarefa(String descricao, LocalDate data) {
        this.descricao = descricao;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean ocorreEm(int year, Month month, int day) {
        return this.data.equals(LocalDate.of(year, month, day));
    }

}
