import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Masukkan bilangan divisor: ");
        int divisor = scanner.nextInt();

        int result = dividend % divisor;

        System.out.println("Hasil " + dividend + " % " + divisor + " = " + result);

        scanner.close();
    }
}
