import java.util.Objects;

import static java.lang.System.out;

public class ECard {
    private String codigo;
    private String titular;
    private double saldo;
    private int numMovs;

    public ECard() {
        codigo = "";
        titular = "";
        saldo = 0.0;
        numMovs = 0;
    }

    public ECard(String codigo, String titular, double saldo, int numMovs) {
        this.codigo = codigo;
        this.titular = titular;
        this.saldo = saldo;
        this.numMovs = numMovs;
    }

    public ECard(ECard ec) {
        codigo = ec.getCodigo();
        titular = ec.getTitular();
        saldo = ec.getSaldo();
        numMovs = ec.getNumMovs();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumMovs() {
        return numMovs;
    }

    public void mudaTitular(String novoTit) {
        titular = novoTit;
    }

    public void carregaECard(double valor) {
        saldo += valor;
        numMovs++;
    }

    public void pagamento(double valor) {
        saldo -= valor;
        numMovs++;
    }

    public boolean prePaga(double val) {
        return saldo >= val;
    }

    @Override
    public String toString() {
        return "ECard numero: '" + codigo + '\'' +
                ", Titular: '" + titular + '\'' +
                ", Saldo Atual: " + saldo +
                ", Movimentos: " + numMovs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ECard eCard = (ECard) o;
        return this.equals(eCard);
    }

    @Override
    public ECard clone() {
        return new ECard(this);
    }
}
