import java.util.Scanner;
public class AsciiArt {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        for(int x = 0;x<i;x++){
            for(int y=0; y<i-x;y++){
                System.out.print("*");
            }
            for(int j = 0; j<2*x;j++){
                System.out.print(" ");
            }
            for(int z = 0;z<i-x;z++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
