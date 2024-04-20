import java.util.Scanner;

public class ReverseTriangle {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Basamak Sayısını Giriniz : ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n; j++) {
                System.out.print("*");

            }
 System.out.println();

        }
    }
}

