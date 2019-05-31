package classwork.class_cast_inheritance;

public class Test {

    public static void main(String[] args) {

        A a = new C();
        D d= (B)a;
        B b = new C();
        D d2 = (A)b;
        d2.toDo();
        ((B) d).eat();
    }
}
