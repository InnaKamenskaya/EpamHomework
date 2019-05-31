package homework1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        toDecimal(str);
    }

   private static void toDecimal(String str){
        for (char c : str.toCharArray()){
            if (c == '1' || c == '0'){
                continue;
            }else {
                throw new NumberFormatException("Wrong input!");
            }
        }
        char c = str.toCharArray()[0];
        int result;
        if (str.length() == 32 && c == '1'){
            result = binaryToNegativeInt(str);
        }else {
            result = binaryToPosistiveInt(str);
        }
        System.out.println("\"" + str + "\" -> " + result);
    }

    private static int binaryToPosistiveInt(String str) {
        int res = 0, a;
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(str.length() - 1 - i);
            a = c == '1' ? 1 : 0;
            res += (a * Math.pow(2, i));
        }
        return res;
    }

    private static int binaryToNegativeInt(String str){
        char c;
        String res = "";
        for(int i = 0; i < str.length(); i++){
            c = str.charAt(i);
            c = c == '1' ? '0' : '1';
            res += c;
        }
        return -(binaryToPosistiveInt(res) + 1);
    }
}
