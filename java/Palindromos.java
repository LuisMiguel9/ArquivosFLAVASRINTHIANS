import java.util.Scanner;

public class Palindromos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        String textoLimpo = limparTexto(entrada);
        if (ehPalindromo(textoLimpo)) {
            System.out.println(textoLimpo + " " + 1);
        } else {
            System.out.println(textoLimpo + " " + 0);
        }
    }


    public static String limparTexto(String texto) {
        return texto.replaceAll("[^a-zA-Z]", "").toUpperCase();
    }
    public static boolean ehPalindromo(String texto) {
        int comprimento = texto.length();
        for (int i = 0; i < comprimento / 2; i++) {
            if (texto.charAt(i) != texto.charAt(comprimento - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
