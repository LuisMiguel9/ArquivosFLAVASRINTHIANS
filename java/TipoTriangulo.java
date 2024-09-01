import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        if((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.print("Invalido");
        }
        else{
            if(a==b && b==c && c == a){
                System.out.print("Equilatero");
            }
            else if (a==b || b==c || c==a){
                System.out.print("Isosceles");
            }
            else{
                System.out.print("Escaleno");
            }

        }
    }
}
