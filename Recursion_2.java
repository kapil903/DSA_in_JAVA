
import java.util.HashSet;



public class Recursion_2 {

    public static int towerofHanoi(int n) {
        //Time compplexity = O(2^n)
        if (n == 1) {
            return 1;
        }
        return 1 + 2 * towerofHanoi(n - 1);
    }
    public static void reverseString(String str, int index) {
        //Time complexity = O(n) where n = length of string
        if (index < 0) {
            return;
        }
        System.out.print(str.charAt(index));
        reverseString(str, index - 1);
    }
    public static int first = -1;
    public static int last = -1;
    public static void findOccurence(String str, int index, char element) {
        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar = str.charAt(index);
        if (currchar == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        findOccurence(str, index + 1, element);
    }
    public static boolean sortedOrNot(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] < arr[index + 1]) {
            return sortedOrNot(arr, index + 1);
        } else {
            return false;
        }
    }
    public static void moveAllX(String str, int index, int count, String newstr) {
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(index);
        if (currchar == 'x') {
            count++;
            moveAllX(str, index + 1, count, newstr);
        } else {
            newstr += currchar;
            moveAllX(str, index + 1, count, newstr);
        }
    }
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str, int index, String newstr) {
        if (index == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(index);
        if (map[currchar - 'a']) {
            removeDuplicates(str, index + 1, newstr);
        } else {
            newstr += currchar;
            map[currchar - 'a'] = true;
            removeDuplicates(str, index + 1, newstr);
        }
    }
    public static void subsequencesOfString(String str, int index, String newstr) {
        //Time Complexity  = O(2^n) 
        if (index == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(index);
        //To be
        subsequencesOfString(str, index + 1, newstr + currchar);
        //Not to be
        subsequencesOfString(str, index + 1, newstr);
    }
    public static void uniqueSubsequencesOfString(String str, int index, String newstr, HashSet<String> set) {
        //Time Complexity  = O(2^n) 
        if (index == str.length()) {
            if (set.contains(newstr)) {
                return;
            } else {
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }
        char currchar = str.charAt(index);
        //To be
        uniqueSubsequencesOfString(str, index + 1, newstr + currchar, set);
        //Not to be
        uniqueSubsequencesOfString(str, index + 1, newstr, set);
    }
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printComb(String str, int index, String combination) {
        if (index == str.length()) {
            System.out.println(combination);
            return;
        }
        char currchar = str.charAt(index);
        String mapping = keypad[currchar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, index + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        // int n = 3;
        // System.out.println("The number of steps taken: " + towerofHanoi(n));
        // String str = "Kapil";
        // reverseString(str, str.length() - 1);
        // String str1 = "bcadjkagha";
        // findOccurence(str1, 0, 'a');
        // int[] arr = {1, 4, 5};
        // System.out.println(sortedOrNot(arr, 0));
        // String str2 = "axxbcdxxw";
        // moveAllX(str2, 0, 0, "");
        // String str = "abbccddd";
        // removeDuplicates(str, 0, "");
        // String str = "aaa";
        // HashSet<String> set = new HashSet<>();
        // uniqueSubsequencesOfString(str, 0, "", set);
        String str = "23";
        printComb(str, 0, "");
    }
}
