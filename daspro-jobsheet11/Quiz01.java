import java.util.Scanner;
import java.util.Random;

public class Quiz01 {
    public static void main(String[] args) {
        
        Scanner sc01 = new Scanner(System.in);
        Random random01 = new Random();
        char menu = 'y';

        do{
            int number = random01.nextInt(10) + 1;
            boolean success = false;
            do{
                System.out.print("Tebak Angka (1-10): ");
                int answer = sc01.nextInt();
                sc01.nextLine();
                success = (answer == number);
            }while (!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = sc01.nextLine().charAt(0);
        }while (menu == 'y' || menu == 'Y');
    }
}
