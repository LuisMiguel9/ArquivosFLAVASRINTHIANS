import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] resposta = new int[50];
        int[] gabarito = new int[50];
        int x;
        int i = 0;

        while ((x = scan.nextInt()) != -1) {
            resposta[i] = x;
            i++;
        }

        int j = 0;
        while ((x = scan.nextInt()) != -1) {
            gabarito[j] = x;
            j++;
        }


        int acertos = 0;
        double perguntas = j;
        for (int k = 0; k < perguntas; k++) {
            if (resposta[k] == gabarito[k]) {
                acertos++;
            }
        }

        double porcentagem = (acertos / perguntas) * 100;
        System.out.printf("%.2f%n", porcentagem);

        scan.close();
    }
}
