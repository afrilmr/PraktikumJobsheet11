import java.util.Scanner;

public class Square01 {
    public static void main(String[] args) {
        
        Scanner sc01 = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = sc01.nextInt();

        for (int iOuter = 1; iOuter <= N; iOuter++){
            for (int i = 1; i <= N; i++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
