import java.util.Scanner;

public class AreaVolume {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double entrada = scan.nextDouble();
        double pi = Math.PI;

        double exp = Math.pow(entrada, 2);
        double exp3 = Math.pow(entrada, 3);
        double A = pi * exp;
        double V = (4.0 / 3.0) * pi * exp3;
        System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.%n", entrada, A);
        System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.%n", entrada, V);
    }
}
