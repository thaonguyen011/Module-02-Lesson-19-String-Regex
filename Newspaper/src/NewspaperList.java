import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class NewspaperList {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://tiki.vn/");
//            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();

            scanner.close();
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
