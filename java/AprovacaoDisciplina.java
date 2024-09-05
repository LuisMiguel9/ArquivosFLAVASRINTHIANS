import java.util.Scanner;
import java.util.ArrayList;
public class AprovacaoDisciplina {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        while(true){
            double nota = scan.nextDouble();
            if(nota == -1){
                break;
            }
            notas.add(nota);
        }
        ArrayList<Integer> presencas = new ArrayList<>();
        while(true){
            int presenca = scan.nextInt();
            if(presenca==-1){
                break;
            }
            presencas.add(presenca);
        }
        int cargaHoraria = scan.nextInt();
        double calculoCargaHoraria = (double) cargaHoraria*0.75;
        int repFreq = 0;
        int notApro=0;
        int notReprov=0;
        for(int i =0;i< presencas.size();i++){
            if(presencas.get(i) < calculoCargaHoraria){
                repFreq++;
            }
            else{
                if(notas.get(i) >= 5.0){
                    notApro++;
                }
                else{
                    notReprov++;

                }
            }
        }
        System.out.printf("%d %d %d", notApro,notReprov,repFreq);
    }
}
