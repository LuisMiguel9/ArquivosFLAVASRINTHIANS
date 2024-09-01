import java.util.Scanner;

public class TanqueCombustivel {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double x= scan.nextDouble();
        int op = scan.nextInt();
        double pi = Math.PI;
        double exp3 = Math.pow(x,3);
        double r3 = Math.pow(r,3);
        double Vesfera = 4.0/3.0*pi*r3;
        double Vcalota = (pi/3.0*Math.pow(x,2)*(3*r-x)); 

        if(op == 1){
            System.out.printf("%.4f",Vcalota);
        }
        else{
            double Vcombustivel = Vesfera - Vcalota;
            System.out.printf("%.4f",Vcombustivel);
        }
    }
}
