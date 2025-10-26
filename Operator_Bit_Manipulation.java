
public class Operator_Bit_Manipulation {

    
    public static void getBit(int n, int pos) {
        int bitmask = 1 << pos;
        if ((bitmask & n) == 0) {
            System.out.println("At position " + pos + " ,bit is Zero");
        } else {
            System.out.println("At position " + pos + " ,bit is One");
        }
    }

    public static int setBit(int n, int pos) {
        int bitmask = 1<<pos;
        return (n | bitmask);
    }
    public static int clearBit(int n, int pos){
        int bitmask = 1<<pos;
        return (~bitmask)&n;
    }
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int pos1 = 2;
        getBit(n, pos);
        getBit(setBit(n, pos), pos);
        getBit(n, pos1);
        getBit(clearBit(n, pos1), pos1);
    }
}
