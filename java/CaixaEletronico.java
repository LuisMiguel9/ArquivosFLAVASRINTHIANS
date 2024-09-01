import java.util.Scanner;
public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int din = scan.nextInt();
        if(din%2 != 0 || din<0){
            System.out.println("Valor Invalido");
        }
        else{
            int val = 0;
            int c = 0;
            int d = 0;
            int t = 0;
            while(val+50<=din){
                val = val + 50;
                c++;
            }
            while(val+10<=din){
                val = val + 10;
                d++;
            }
            while(val+2<=din){
                val = val + 2;
                t++;
            }
            System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2",c,d,t);
        }

    }
}
