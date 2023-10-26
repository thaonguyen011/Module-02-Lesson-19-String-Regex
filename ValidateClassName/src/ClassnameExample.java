import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassnameExample {

    private static final String CLASSNAME_PATTERN = "^[CAP]([0-9]{4})[GHIK]";
    private static Pattern pattern = Pattern.compile(CLASSNAME_PATTERN);
    private static Matcher matcher;


    public static boolean validate(String classname) {
        matcher = pattern.matcher(classname);
        return matcher.matches();
    }
}
