import java.util.Scanner;
public class ValorExpoente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int exp = 1;
        double som = 2;
        while(som <=num){
            exp++;
            som += Math.pow(2, exp);
        }
        System.out.printf("%d",exp);
        scan.close();
    }
}