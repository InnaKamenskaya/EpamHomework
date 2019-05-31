package homework1;

public class Task4 {

    public static void main(String[] args) {

        System.out.println(gcd(18, 30));
    }

    static int gcd(int m, int n){
        if(m == 0) return n;
        if(n == 0) return m;
        if(n == m) return n;
        if(m == 1) return 1;
        if(n == 1) return 1;
        boolean em = (m & 1) == 0;
        boolean en = (n & 1) == 0;
        if(em && en) return gcd(m >> 1, n >> 1) << 1;
        if(em) return gcd(m >> 1, n);
        if(en) return gcd(m, n >> 1);
        if(n > m) return gcd((n - m) >> 1, m);
        return gcd((m - n) >> 1, n);
    }

}
