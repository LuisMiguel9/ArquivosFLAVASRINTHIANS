import java.util.Scanner;

public class VolumeCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double H = scan.nextDouble();
        double x = scan.nextDouble();
        double r = scan.nextDouble();
        double v = 0;
        double y =0;
        double r3 = (Math.pow(r, 3));
        double pi = Math.PI;
        if(x>H||x<0||r<0||H<=0){
            System.out.println("-1.000");
        }
        else{
            if(x<=H-r&& x>=r){
                v = (pi/3)*(r*r)*((3*x)-r);
            }
            else if(x<r){
                v = y*pi*r3;
                double s = (pi/3)*(x*x)*((3*r)-x);
                v -= s;
                v = Math.abs(v);
                
            }
            System.out.printf("%.3f\n",v);
        }
        scan.close();
    }
}

