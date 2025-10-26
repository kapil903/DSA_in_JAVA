import java.util.Scanner;

public class Advance_patttern_questions {
    //ADVANCED PATTERNS
    /* BUTTERFLY
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=(n-i)*2; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
        }
        for(int i = n; i>0; i--){
            for(int j = i; j>0; j--){
                System.out.print("*");
            }
            for(int j = 1; j<=(n-i)*2; j++){
                    System.out.print(" ");
            }
            for(int j =i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/

    /* PARALLELOGRAM
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j =1; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }    
    }*/
    
    /* NUMBER PYRAMID
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=n-i; j++){
                    System.out.print(" ");
                }
            for(int j = 1; j<=i*2-1; j++){
                if(j%2==0){
                    System.out.print(" ");
                }
                else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }*/
    
    /*Palindromic pyramid 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=n-i; j++){
                    System.out.print(" ");
                }
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
            for(int j = 2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i>0; i--){
            for(int j = n-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j = i*2-1; j>0; j--){
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}

