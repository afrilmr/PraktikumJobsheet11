import java.util.Scanner;

public class Tugas201 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int n = sc01.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
