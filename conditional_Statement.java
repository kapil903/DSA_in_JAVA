import java.util.Scanner;

public class conditional_Statement {
    public static void main(String[] args) {
        System.out.println("kapil");
        Scanner sc = new Scanner(System.in);
        //IF_ELSE Statement
        /*int x = sc.nextInt();
        if(x>18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are a minor");
        }*/
        /*int y = sc.nextInt();
        if(y%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }*/
        //SWITCH STATEMENT
        String language = sc.nextLine();
        switch (language) {
            case "hindi" -> System.out.println("Namaste");
            case "french" -> System.out.println("Bonjour");
            case "english" -> System.out.println("hello");
            default -> {
            }
        }
    }
}
