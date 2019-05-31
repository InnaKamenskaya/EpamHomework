package homework1;

public class Task5 {

    public static void main(String[] args) {

        bitChange2(73, 3);
    }

    public static void bitChange(int digit, int pos){

        if ((digit >> pos & 1) == 1){
            digit = digit ^ 1 << pos;
        }else {
            System.out.println(false);
        }

        System.out.println(digit);
    }

    static void bitChange2(int digit, int pos){
        int count = 0;
        System.out.println(Integer.toBinaryString(digit));
        for (int i = 0; i < 32; i++) {
            if (pos > 0){
                if ((digit >> i & 1) == 1){
                    pos--;
                }
            }else {
                count = i;
                break;
            }
        }
        digit = digit ^ 1 << (count-1);
        System.out.println(Integer.toBinaryString(digit));
        System.out.println(count);
    }
}
