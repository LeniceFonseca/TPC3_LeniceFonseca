import static java.lang.System.out;

public class TesteString {
    public static void main(String[] args) {

        String str1 = "Carlos";
        String str2 = "Carla";
        String str3 = "Carlota";
        String str4 = "";
        int c = str1.compareTo(str2);

        // Retorna o caractere posicionada na quinta posicao da string
        out.println(str1.charAt(5));

        // Comparacao de strings
        if (c < 0) {
            out.println(str1 + " eh maior lexicamente que " + str2);
        }
        else {
            out.println(str2 + " eh maior lexicamente que " + str1);
        }

        // Verificar se string esta vazia
        out.println(str4.isEmpty());

        // Substituicao de Strings
        out.println(str2.replace("a", "i"));

        // Converter string para maiuscula
        out.println(str3.toUpperCase());

        // Separar string
        String[] str5 = str3.split("a");
        for (String s : str5) {
            out.print(s + " ");
        }
    }
}