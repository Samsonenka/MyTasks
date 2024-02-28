package Tasks;

public class Task1 {

    public double valueG (int a, int b, double m1, double m2){

        double G;

        G = 4 * Math.pow(Math.PI,2) * (Math.pow(a,3) / (Math.pow(b,2) * (m1+m2)));

        return G;
    }
}
