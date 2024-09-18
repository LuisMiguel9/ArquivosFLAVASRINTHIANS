import java.util.Scanner;
public class RaizDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextInt();
        double cont = 1;
        double x = 2;
        for(int i=0;i<num;i++){

                x = 1 + cont/(2+(x-1));
                System.out.printf("%.14f\n",x);

        }
        scan.close();

    }

}
