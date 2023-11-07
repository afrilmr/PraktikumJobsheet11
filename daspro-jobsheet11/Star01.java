import java.util.Scanner;

public class Star01 {
    public static void main(String[] args) {

        Scanner sc01 = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = sc01.nextInt();

        for (int i = 1; i <= N; i++){ // Asli (tanpa modifikasi)
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i <= N; i++){ // Inisialisasi i=1 diubah menjadi i=0
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i > N; i++){ // Inisialisasi i<=N diubah menjadi i>N
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= N; i--){ // Inisialisasi i++ diubah menjadi i--
            System.out.print("*");
        }
    }
}