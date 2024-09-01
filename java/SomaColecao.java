import java.util.Scanner;

public class SomaColecao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int entrada;
        int soma=0;
        while((entrada = scan.nextInt()) != -1){
            soma+=entrada;
        }
        System.out.printf("%d",soma);
    }
}
