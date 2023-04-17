import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner store = new Scanner(System.in);
        System.out.print("input how many terms u want: ");
        int n = store.nextInt();

        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.print("the fibonacci sequence of " + n + " terms is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        store.close();
    }
}
