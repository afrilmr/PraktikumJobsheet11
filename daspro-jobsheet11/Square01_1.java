import java.util.Scanner;

public class Square01_1 {
    public static void main(String[] args) {
        
        Scanner sc01 = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = sc01.nextInt();

        for (int iOuter = 0; iOuter <= N; iOuter++){ // Inisisalisasi iOuter=1 diubah menjadi iOuter=0
            for (int i = 1; i <= N; i++){
            System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int iOuter = 1; iOuter <= N; iOuter++){ // Inisisalisasi i=1 diubah menjadi i=0
            for (int i = 0; i <= N; i++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
