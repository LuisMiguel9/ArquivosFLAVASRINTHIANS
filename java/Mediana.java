import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int count = 0;
        while (true) {
            int numero = scanner.nextInt();

            if (numero == -1) {
                break;
            }
            if (count == numeros.length) {
                int[] novoVetor = new int[numeros.length * 2];
                for (int i = 0; i < numeros.length; i++) {
                    novoVetor[i] = numeros[i];
                }
                numeros = novoVetor;
            }

            numeros[count] = numero;
            count++;
        }

        double mediana;
        if (count % 2 == 1) {
            mediana = numeros[count / 2];
        }
        else {
            mediana = (numeros[(count / 2) - 1] + numeros[count / 2]) / 2.0;
        }

        System.out.printf("%.1f%n", mediana);
    }
}
