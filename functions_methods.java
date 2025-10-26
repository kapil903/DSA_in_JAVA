import java.util.Scanner;

public class functions_methods {
    // FUNCTIONS
    public static void printMyName(String key) {
        System.out.println(key);
    }

    public static int sum_odd_numbers(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i%2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("the sum of odd numbers till given number: " + sum_odd_numbers(num1));
    }
}
