package homework1;

public class Task3 {

    public static void main(String[] args) {
       int integer = 34543262;
       byte b = 121;
       long l = 123123547818739317L;
       short sh  = 2345;
       countBits(l);
       countBits(integer);
       countBits(b);
       countBits(sh);
    }

    private static int countBits(int digit){

        int count;
        for (count = 0; digit > 0; ++count) {
            digit &= digit - 1;
        }
        System.out.println(count);
        return count;
    }

    private static int countBits(byte digit){

        int count;
        for (count = 0; digit > 0; ++count) {
            digit &= digit - 1;
        }
        System.out.println(count);
        return count;
    }

    private static int countBits(long digit){

        int count;
        for (count = 0; digit > 0; ++count) {
            digit &= digit - 1;
        }
        System.out.println(count);
        return count;
    }

    private static int countBits(short digit){

        int count;
        for (count = 0; digit > 0; ++count) {
            digit &= digit - 1;
        }
        System.out.println(count);
        return count;
    }
}
