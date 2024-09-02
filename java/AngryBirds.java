import java.util.Scanner;
public class AngryBirds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double v = scan.nextDouble();
        double ag = scan.nextDouble();
        double d = scan.nextDouble();
        double radians = Math.toRadians(ag);
        double r = ((v*v)*(Math.sin(radians*2)))/9.8;
        if(d-r<=0.1){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        scan.close();
    }
}
