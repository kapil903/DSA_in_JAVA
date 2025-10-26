public class Practice {
    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumOfDigits(n-1);
    }
    public static void main(String[] args) {
        int n = 34;
        System.out.println(sumOfDigits(n));
    }
}
