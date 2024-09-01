import java.util.Scanner;
public class Fahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float i = scan.nextFloat();
        float x = ((9*i)/5)+32;
        System.out.printf("%.1f",x);
    }
}
