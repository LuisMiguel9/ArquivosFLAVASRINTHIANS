import java.util.Scanner;

public class AproximacaoPi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = 2;
        double b = 3;
        double c = 4;
        double pi = 3;
        int i = scan.nextInt();
        System.out.printf("%.6f\n",pi);
        for(int j = 1;j<i;j++){
            if(j%2!=0){
                pi += (4/(a*b*c));
                System.out.printf("%.6f\n",pi);
                a +=2;
                b+=2;
                c+=2;
            }
            else{
                pi -= (4/(a*b*c));
                System.out.printf("%.6f\n",pi);
                a +=2;
                b+=2;
                c+=2;
            }
        }
        scan.close();
    }
}
