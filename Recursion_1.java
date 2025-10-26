

public class Recursion_1 {

    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }

    public static int sumNaturalnumbers(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumNaturalnumbers(n - 1);

    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        printFib(b, c, n - 1);
    }

    public static int findPower(int n, int p) {
        //Stack Height  = n
        if (p == 0) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return n * findPower(n, p - 1);
    }

    public static int findpower(int n, int p) {
        //Stack Height  = logn
        if (p == 0) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        if (p % 2 == 0) {
            return findpower(n, p / 2) * findpower(n, p / 2);
        } else if (p % 2 != 0) {
            return findpower(n, p / 2) * findpower(n, p / 2) * n;
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 6;
        int a = 0, b = 1;
        printNumbers(n);
        System.out.println("The sum of " + n + " natural numbers is: " + sumNaturalnumbers(n));
        System.out.println("The factorial of number " + n + " is: " + factorial(n));
        System.out.print(a + " ");
        System.out.print(b + " ");
        printFib(0, 1, n - 2);
        System.out.println(); 
        System.out.println(findPower(4, 3));
        System.out.println(findpower(n, 3));
    }

}
