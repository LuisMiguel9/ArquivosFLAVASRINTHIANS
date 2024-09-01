import java.util.Scanner;
public class ArteAscii {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = 0;
        for(int x = i;x>0;x--){
            
            for(int y = 0;y<x;y++){
                System.err.print("*");
            }
            System.err.println();
        }
        for(int x = 0; x<i;x++){
            for(int y=0;y<=x;y++){
                System.err.print("*");
            }
            System.err.println();
        }
    }
}
