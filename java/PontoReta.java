import java.util.Scanner;
public class PontoReta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b= scan.nextDouble();
        if(2*a+b == 3){
            System.out.printf("Ponto (%.1f, %.1f) pertence a reta 2x + y = 3.",a,b);
        }
        else{
            System.out.printf("Ponto (%.1f, %.1f) nao pertence a reta 2x + y = 3.",a,b);
        }
    }
}
