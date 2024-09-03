import java.util.ArrayList;
import java.util.Scanner;

public class AreaPoligono {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> valoresDeX = new ArrayList<>();
        ArrayList<Double> valoresDeY = new ArrayList<>();
        while (true) {
            double x = scan.nextDouble();
            if (x == -1) {
                break;
            }
            valoresDeX.add(x);
        }

        while (true) {
            double y = scan.nextDouble();
            if (y == -1) {
                break;
            }
            valoresDeY.add(y);
        }
        double area = calcularAreaPoligono(valoresDeX, valoresDeY);
        System.out.printf("%.4f\n", area);
    }

    public static double calcularAreaPoligono(ArrayList<Double> x, ArrayList<Double> y) {
        int n = x.size();
        double area = 0;

        for (int i = 0; i < n - 1; i++) {
            area += x.get(i) * y.get(i + 1);
            area -= y.get(i) * x.get(i + 1);
        }

        area += x.get(n - 1) * y.get(0);
        area -= y.get(n - 1) * x.get(0);

        area = Math.abs(area) / 2.0;

        return area;
    }
}
