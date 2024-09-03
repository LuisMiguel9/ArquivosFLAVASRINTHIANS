import java.util.Scanner;

public class NumeroNeperiano {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        double soma=0;
        double e = 0;
        for(double i=0;i<entrada;i++){
            e =+ 1.0/fatorial(i);
            soma += e;
        }
        System.out.printf("%.6f", soma);

    }
    static double fatorial(double n){
        double multi=1;
        while(n > 0){
            multi*=n;
            n--;
        }
        return multi;

    }

    }

