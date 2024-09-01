
import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double entrada = scan.nextDouble();
        double saida = Math.sqrt(entrada);
        System.out.printf("%.4f%n",saida);
    }
}
