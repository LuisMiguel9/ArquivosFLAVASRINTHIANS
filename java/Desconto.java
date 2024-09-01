import java.util.Scanner;
public class Desconto {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        float SemDesconto = scan.nextFloat();
        if(SemDesconto > 200){
            float ComDesconto = SemDesconto*0.05f;
            float ValorPagar = SemDesconto - ComDesconto;
            System.out.printf("%.2f\n",ValorPagar);

        }
        else{
            System.out.printf("%.2f\n", SemDesconto);
        }
    }
}
