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
        double x=0;
        double mult=1;
        if(n == 0){
            return mult;
        }
        else{
            for(double i = 1;i<=n;i++){
                mult*=i;
            }
        }
            return mult;
        }

    }

