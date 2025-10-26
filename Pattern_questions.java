import java.util.Scanner;

public class Pattern_questions {
    /* 
    public static void main(String[] args) {
        //HOLLOW RECTANGLE
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();
        for(int i=1; i<=w; i++){
            for(int j=1; j<=l; j++){
                if(i==1 || i==w || j==1 || j==l){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }*/

    /* 
    public static void main(String[] args) {
        //HALF PYRAMID
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/

    /* 
    public static void main(String[] args) {
        //INVERT HALF PYRAMID
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i > 0; i--){
            for(int j = i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

