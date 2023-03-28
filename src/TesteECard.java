import static java.lang.System.out;

public class TesteECard {
    public static void main(String[] args) {

        ECard meuECard = new ECard("123abc", "Lenice Fonseca", 1500.5, 10);
        meuECard.mudaTitular("Paulo Silva");
        meuECard.pagamento(43.6);
        out.println(meuECard.toString());

    }
}
