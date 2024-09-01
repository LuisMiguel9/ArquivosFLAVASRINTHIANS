import java.util.Scanner;
public class ContaEnergia {
   public static void main(String[] args){
       float conta;
       float saida = -1.00f;
       Scanner scan = new Scanner(System.in);
       float entrada = scan.nextFloat();
       char tipo = scan.next().charAt(0);
       if(entrada < 0){
           System.out.printf("%.2f%n",saida);
       }
       else{
           if((tipo == 'R') || (tipo == 'r')){
               if(entrada <=500){
                   conta = entrada*0.40f;
               }
               else{
                   conta = entrada*0.65f;
               }
               System.out.printf("%.2f%n",conta);
           }
           else if((tipo == 'C') || (tipo=='c')){
               if(entrada <=1000){
                   conta = entrada*0.55f;
               }
               else{
                   conta = entrada*0.60f;
               }
               System.out.printf("%.2f%n",conta);
           }
           else if((tipo == 'I') || (tipo == 'i')){
               if(entrada <= 5000){
                   conta = entrada*0.55f;
               }
               else{
                   conta = entrada*0.60f;
               }
               System.out.printf("%.2f%n", conta);
           }
           else{
               System.out.printf("%.2f%n",saida);
           }
       }
   }
}
