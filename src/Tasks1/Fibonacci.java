package Tasks1;

public class Fibonacci {

    public static void main(String[] args) {

        long fibonacci = new Fibonacci().getFibonacciByIndex(10);

        System.out.println(fibonacci);
    }

    public long getFibonacciByIndex(int index){

        int n0 = 0;
        int n1 = 1;

        for ( int i = 2; i <= index; i++ ){
            int n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        return n1;
    }
}
