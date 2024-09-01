import java.util.Scanner;

public class RotaOrtodromica{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double t1 = scan.nextDouble();
        double lat1 = Math.toRadians(t1);
        double g1 = scan.nextDouble();
        double long1 = Math.toRadians(g1);
        double t2 = scan.nextDouble();
        double lat2 = Math.toRadians(t2);
        double g2 = scan.nextDouble();
        double long2 = Math.toRadians(g2);
        double R = 6371;
        double d =  R* Math.acos(Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(long1 - long2));
        System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km%n", t1, g1, t2, g2, d);


    }
}
