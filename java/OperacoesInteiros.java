import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class OperacoesInteiros {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            ArrayList<Integer> vetor = new ArrayList<>();
            while(true){
                int entrada = scan.nextInt();
                if(entrada == -1){
                    break;
                }
                vetor.add(entrada);
            }
            if(vetor.isEmpty()){
                break;
            }
            int max = Collections.max(vetor);
            int min = Collections.min(vetor);
            int tamanho = vetor.size();
            int par=0;
            int impar=0;
            int soma=0;
            for(int i=0;i<vetor.size();i++){
                if(vetor.get(i)%2==0){
                    par++;
                }
                else{
                    impar++;
                }
                soma += vetor.get(i);
            }
            double media = (double) soma/vetor.size();

            System.out.println(tamanho);
            System.out.println(par);
            System.out.println(impar);
            System.out.println(soma);
            System.out.printf("%.2f%n",media);
            System.out.println(max);
            System.out.println(min);

        }


    }
}
