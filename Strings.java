
public class Strings {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Kapil");
        System.out.println(sb);
        // set char at index 
        sb.setCharAt(0, 'S');
        System.out.println(sb);
        //delete a extra char
        sb.delete(1, 3);
        System.out.println(sb);
        //To add an extra char at end
        sb.append('k');
        System.out.println(sb);
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);

    }

}
