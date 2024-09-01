import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        int soma = 0;
        int comp = Math.abs(entrada);

        while(comp > 0){
            int digito = comp%10;
            soma+=digito;
            comp/=10;
        }
        System.out.printf("%d",soma);

    }
}
//Entrada Inicial:
//
//O usuário digita 3141.
//numero recebe o valor 3141.
//soma é inicializada com 0.
//temp é definido como Math.abs(numero), que é 3141 (não muda, pois já é positivo).
//Primeira Iteração do while:
//
//temp = 3141:
//digito = temp % 10:
//3141 % 10 resulta em 1 (último dígito).
//soma += digito:
//soma é atualizado de 0 para 1.
//temp /= 10:
//3141 / 10 resulta em 314 (remove o último dígito).
//Segunda Iteração do while:
//
//temp = 314:
//digito = temp % 10:
//314 % 10 resulta em 4.
//soma += digito:
//soma é atualizado de 1 para 5 (1 + 4).
//temp /= 10:
//314 / 10 resulta em 31.
//Terceira Iteração do while:
//
//temp = 31:
//digito = temp % 10:
//31 % 10 resulta em 1.
//soma += digito:
//soma é atualizado de 5 para 6 (5 + 1).
//temp /= 10:
//31 / 10 resulta em 3.
//Quarta Iteração do while:
//
//temp = 3:
//digito = temp % 10:
//3 % 10 resulta em 3.
//soma += digito:
//soma é atualizado de 6 para 9 (6 + 3).
//temp /= 10:
//3 / 10 resulta em 0 (o loop termina).
//Saída Final:
//
//O loop while termina porque temp é agora 0.
//O programa imprime: "A soma dos dígitos de 3141 é: 9".
//Resumo
//O número 3141 tem os dígitos 3, 1, 4, e 1.
//A soma dos dígitos é calculada como 3 + 1 + 4 + 1 = 9.
//O resultado final é 9.



