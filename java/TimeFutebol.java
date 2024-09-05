import java.util.Scanner;
import java.util.ArrayList;

public class TimeFutebol {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int entrada;
        ArrayList<Integer> casa = new ArrayList<>();
        ArrayList<Integer> fora = new ArrayList<>();
        int vit=0;
        int emp=0;
        int der=0;

        while(true){
            entrada = scan.nextInt();
            if(entrada == -1){
                break;
            }
            casa.add(entrada);
        }
        while(true){
            entrada = scan.nextInt();
            if(entrada == -1){
                break;
            }
            fora.add(entrada);
        }
        for(int i=0;i<casa.size();i++){
            if(casa.get(i) > fora.get(i)){
                vit++;
            }
            else if(casa.get(i) == fora.get(i)){
                emp++;
            }
            else{
                der++;
            }


        }
        System.out.printf("%d %d %d",vit,emp,der);
    }
}
