import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {

    private static Matcher matcher;
    private static final String ACCOUNT_PATTERN = "^[_a-z0-9]{6,}$";
    private static Pattern pattern = Pattern.compile(ACCOUNT_PATTERN);


    public static boolean validate(String account) {
        matcher = pattern.matcher(account);
        return matcher.matches();
    }


}
