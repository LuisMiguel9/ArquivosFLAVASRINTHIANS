import java.util.Scanner;
public class PinturaMuro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float v = scan.nextFloat();
        float c = (v*36)+100;
        System.out.printf("%.1f",c);
        scan.close();
    }
}
