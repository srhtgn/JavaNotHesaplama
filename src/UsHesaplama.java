import java.util.Scanner;

public class UsHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tabanı girin: ");
        int base  = scanner.nextInt();

        System.out.print("Üssü girin: ");
        int exponent  = scanner.nextInt();

        int result  = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println(base + "^" + exponent + " = " + result);

        scanner.close();
    }
}
