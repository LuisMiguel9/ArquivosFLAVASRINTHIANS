import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    float a = scan.nextFloat();
    float b = scan.nextFloat();
    float c = scan.nextFloat();
    float d = (a+b+c)/3;
    System.out.printf("%.2f",d);
    }
}
