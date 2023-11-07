import java.util.Scanner;

public class Triangle01_1 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        System.out.print("Masukkan Nilai N = ");
        int N = sc01.nextInt();
        int i=0;

        while(i <= N){
            int j = 0;
            while(j < i){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println(); // untuk menampilkan seperti bentuk segitiga sama kaki
        }
    }
}
