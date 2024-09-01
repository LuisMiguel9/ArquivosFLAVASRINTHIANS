import java.util.Scanner;
public class TanqueCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double x = scan.nextDouble();
        int cmd = scan.nextInt();
        double pi = Math.PI;
        double v;
        double y = 4.0/3;
        double r3 = Math.pow(r, 3);
        if(cmd == 2){
            v = y*pi*r3;
            double s = (pi/3)*(x*x)*((3*r)-x);
            v -= s;
        }
        else{
            v = (pi/3)*(x*x)*((3*r)-x);
        }
        System.out.printf("%.4f%n",v);
    }
}
