import java.util.Scanner;

public class SomaColecoes{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int entrada;
        int outro;
        int soma=0;
        while((entrada = scan.nextInt()) != -1){
            soma+=entrada;
            while((entrada = scan.nextInt()) != -1){
                soma+=entrada;
            }
            System.out.printf("%d",soma);
            soma = 0;

        }


    }
}
