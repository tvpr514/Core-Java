
/* Perfect number Example is 
   Its factors sum must be equal to the number
   6-> 1+2+3(it is perfect number)
 */
import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number u want to check :");
        int n = sc.nextInt();
        boolean b = IsPerfect(n);
        if (b) {
            System.out.println("It is Perfect number");
        } else {
            System.out.println("It is not perfect number");
        }
    }

    public static boolean IsPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return n == sum;
    }
}
