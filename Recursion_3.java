

public class Recursion_3 {
    public static void printPerm(String str, String permutation){
        //Time Comlpexity  = O(n*n!)
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            printPerm(newstr, permutation+currchar);
        }
    }
    public static void countpaths(int n, int m){
         
    }
    public static void main(String[] args) {
        String str = "abc";
        printPerm(str,"");
    }
}
