import java.util.Scanner;
public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double val = scan.nextDouble();
        int hor =  scan.nextInt();
        double bruto = val*hor;
        double irr = bruto*0.11;
        double inss = bruto*0.08;
        double tot = irr+inss;
        double liq = bruto - tot;
        System.out.printf("Salario bruto: R$%.2f%n\nIR: R$%.2f%n\nINSS: R$%.2f%n\nTotal de descontos: R$%.2f%n\nSalario liquido: R$%.2f%n",bruto,irr,inss,tot,liq);
    }
}
