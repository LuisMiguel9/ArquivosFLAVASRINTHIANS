import java.util.Scanner;

public class CifraCesar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        String[] partes = entrada.split(" ", 2);
        int deslocamento = Integer.parseInt(partes[0]);
        String mensagem = partes[1];
        String mensagemCifrada = criptografar(mensagem, deslocamento);
        System.out.println(mensagemCifrada);
    }

    public static String criptografar(String mensagem, int deslocamento) {
        StringBuilder mensagemCifrada = new StringBuilder();
        deslocamento = deslocamento % 26;

        for (int i = 0; i < mensagem.length(); i++) {
            char cOriginal = mensagem.charAt(i);

            if (cOriginal >= 'a' && cOriginal <= 'z') {
                char cCifrado = (char) ((cOriginal - 'a' + deslocamento) % 26 + 'A');
                mensagemCifrada.append(cCifrado);
            }
            else if (cOriginal >= 'A' && cOriginal <= 'Z') {
                char cCifrado = (char) ((cOriginal - 'A' + deslocamento) % 26 + 'A');
                mensagemCifrada.append(cCifrado);
            }

            else {
                mensagemCifrada.append(cOriginal);
            }
        }

        return mensagemCifrada.toString();
    }
}
