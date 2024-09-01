import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int quantidade = scan.nextInt();
        int x=0;
        while(x<quantidade){
            if(x%2==0){
                for(int i=0;i<quantidade;i++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print(" ");
                for(int j=0;j<quantidade;j++){

                    System.out.print("* ");
                }

            }

            System.out.print("\n");
            x++;
        }
    }
}
