import java.util.Scanner;
public class DistanciaAviao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = {
            {0, 2, 11, 6, 15, 11, 1},
            {2, 0, 7, 12, 4, 2, 15},
            {11, 7, 0, 11, 8, 3, 13},
            {6, 12, 11, 0, 10, 2, 1},
            {15, 4, 8, 10, 0, 5, 13},
            {11, 2, 3, 2, 5, 0, 14},
            {1, 15, 13, 1, 13, 14, 0}
        };
        int num = scan.nextInt();
        int dis = 0;
        while(num!=-1){
            int n = num%10;
            int num2 = scan.nextInt();
            int x = num2%10;
            if(num2!=-1){
                dis += matriz[n-1][x-1];
            }
            num = num2;
        }
        System.out.println(dis);
        scan.close();
        
    }
}
