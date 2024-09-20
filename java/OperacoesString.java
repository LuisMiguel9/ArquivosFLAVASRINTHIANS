import java.util.Scanner;

public class OperacoesString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.println(text.length());
        System.out.printf("%s\n",text.substring(0, 1));
        System.out.printf("%s\n",text.substring(text.length()-1, (text.length())));
        System.out.printf("%s\n",text.toUpperCase());
        System.out.printf("%s\n",text.toLowerCase());
        System.out.printf("%s\n",(text.toLowerCase()).replace('a','e'));
        String text2 = text.toLowerCase();
        String par = "";
        int cont = 0;
        for (int i=0; i<text2.length(); i++) {
            String c = text2.substring(i, i+1);
            if(i%2==0||c==" "){
                par= par + c;
            }
         }
         System.out.printf("%s\n",par);
        for (int i=0; i<text2.length(); i++) {
            char c = text2.charAt(i);
            if(c == 'a'||c=='e'||c=='i'||c=='o'||c=='u'){
                cont++;
            }
         }
         System.out.printf("%d\n",cont);
        scan.close();
    }
}