import java.util.Scanner;

public class AproximacaoSeno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double entrada = scan.nextDouble();
        double angulo = Math.toRadians(entrada);
        int termos = scan.nextInt();
        double resultado = angulo;

        System.out.printf("%.10f\n", angulo);

        for (int i = 1; i < termos; i++) {
            int potencia = 2 * i + 1;
            double termo = Math.pow(angulo, potencia) / fatorial(potencia);
            if (i % 2 == 0) {
                resultado += termo;
            } else {
                resultado -= termo;
            }
            System.out.printf("%.10f", resultado);
        }

        scan.close();
    }

    static double fatorial(int n) {
        double multi = 1;
        while (n > 0) {
            multi *= n;
            n--;
        }
        return multi;
    }
}
