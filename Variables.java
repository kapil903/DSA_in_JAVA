import java.util.*;

public class Variables {
    public static void main(String[] args) {
        // output
        System.out.println("kapil");
        System.out.print("Nikhil\n");
        System.out.println("*\n**\n***\n****");
        // variables
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println(sum);
        int diff = b - a;
        System.out.println(diff);
        int ans = a * b / b - a;
        System.out.println(ans);
        // Input
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int total = x + y;
        System.out.println(total);

    }
}