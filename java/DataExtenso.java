import java.util.Scanner;

public class DataExtenso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String[] calendario;
        calendario = new String[]{"janeiro", "fevereiro", "março", "abril", "maio", "junho",
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        int ano=0;
        int mes=0;
        int dia=0;
        ano = num%10000;
        num /=10000;
        mes = num%100;
        num /=100;
        dia = num;
        int i = 0;
        while (i+1!=mes) {
            i++;
        }
        String meS = calendario[i];
        System.out.printf("%02d de %s de %04d",dia,meS,ano);
        scan.close();
    }
}
