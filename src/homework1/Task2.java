package homework1;


public class Task2 {

    public static void main(String[] args) {
        changeSign("-23");

    }

    private static void changeSign(String str){

        int digit = Integer.parseInt(str);
        if (digit < 0){
            int i = Integer.parseInt(str);
            i = ~i + 1;
            System.out.println(i);
        }else {
            throw new NumberFormatException("Wrong input");
        }

    }
}
