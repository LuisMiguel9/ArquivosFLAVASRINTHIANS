import java.util.Scanner;
public class NumeroNarcisista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int numDigitos = String.valueOf(num).length();
        int val = 0;
        int gua = num;
        while (num > 0) {
            int digito = num % 10;  
            val += Math.pow(digito, numDigitos);  
            num /= 10;  
        }
        if(val == gua){
            System.out.println("SIM");
        }
        else{
            System.out.println("NAO");
            scan.close();
        }
    }

}
