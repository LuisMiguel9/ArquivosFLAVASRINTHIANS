import java.util.Scanner;

public class MediaColecao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double entrada;
        double media;
        double soma =0;
        int cont=0;
        while((entrada = scan.nextInt()) != -1){
            soma+=entrada;
            cont++;
        }
        media = soma/cont;
        System.out.printf("%.2f",media);

    }
}