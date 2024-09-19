import java.util.Scanner;
import java.util.Arrays;
public class DiaSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        double sem[] = {0,0,0,0,0,0,0};
        int j =0;
        while(num!=-1){
            sem[j % 7] += num;
            j++;
            num = scan.nextDouble();
        }
        double max = Arrays.stream(sem).max().getAsDouble();
        for(int i=0;i<sem.length;i++){
            if(sem[i]==max){
                System.out.println(i+1);
            }
        }
        scan.close();
    }
}
