import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static final String PHONE_NUMBER_PATTERN = "\\(\\d{2}\\)-\\([0]\\d{9}\\)";
    private static Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
    private static Matcher matcher;

    public static boolean validate(String phoneNumber) {
        matcher = pattern.matcher(phoneNumber);
        return matcher.matches();

    }
}
