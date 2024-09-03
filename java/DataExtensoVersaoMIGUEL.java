import java.util.Scanner;

public class DataExtensoVersaoMIGUEL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String entrada = scan.nextLine();
        String dia = entrada.substring(0, 2);
        String mes = entrada.substring(2, 4);
        String ano = entrada.substring(4);
        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        int mesIndex = Integer.parseInt(mes) - 1;
        System.out.printf("%s de %s de %s", dia, meses[mesIndex], ano);
    }
}


