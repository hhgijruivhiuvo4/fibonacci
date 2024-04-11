public class Fibonacci {

    public static void main(String[] args) {
        int n = 10; // Número de termos da sequência desejados

        System.out.println("Sequência de Fibonacci de " + n + " termos:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}