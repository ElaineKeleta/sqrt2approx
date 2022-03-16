import java.util.Scanner;
public class Sqrt2Approximator {
    private static final String REQUEST = "How many approximations to sqrt(2) would you like to see?";

    private static int pellNumber(int n){
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        return 2 * pellNumber(n - 1) + pellNumber(n - 2);
    }

    public static void printSeries(int n){
        for (int i = 1; i < n + 1; i++){
            double a = (pellNumber(i - 1)+pellNumber(i));
            double b = (pellNumber(i));
            System.out.println(a+"/"+b+"="+ a/b);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Sqrt2Approximator sqrt2Approximator = new Sqrt2Approximator();
        System.out.println(REQUEST);
        System.out.print("> ");
        while (scanner.hasNextInt()){
            Sqrt2Approximator.printSeries(scanner.nextInt());
        }
    }

}
