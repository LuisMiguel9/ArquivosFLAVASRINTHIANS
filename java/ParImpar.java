import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        while(i != -1){
            if(i%2 == 0){
                System.err.println("PAR");
            }
            else{
                System.err.println("IMPAR");
            }
            i = scan.nextInt();
        }
    }
}
