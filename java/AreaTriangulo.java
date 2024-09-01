import java.util.Scanner;
public class AreaTriangulo {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double a = scan.nextDouble();
    double b = scan.nextDouble();
    double c = scan.nextDouble();
    if(a+b>c && a+c>b && c+b>a){
        double s = (a+b+c)/2;
        double A = s*(s-a)*(s-b)*(s-c);
        double raiz = Math.sqrt(A);
        System.out.printf("%.2f%n",raiz);
    }
    else{
        System.out.println("Triangulo invalido");
    }
    }
}
