
import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        // FOR LOOP
        /*for(int i=0; i<5; i++){
            System.out.println(i);
        }*/
        //WHILE LOOP
        /*int i=0;
        while (i<11) {
            System.out.println(i);
            i++;
        }*/
        // DO WHILE LOOP
        /*int i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i<11);*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }

    }
}
