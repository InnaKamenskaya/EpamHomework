import java.io.File;
import java.io.IOException;

public class Hello2 {

    public static void main(String[] args) {
        File file = new File("E:\\new\\test\\com\\Hello.class");
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
