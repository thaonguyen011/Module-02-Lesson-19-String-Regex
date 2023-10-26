public class AccountExampleTest {
    public static void main(String[] args) {
        String[] validAccount = new String[] {"123abc_", "_abc123", "_____", "123456", "abcdefg"};
        String[] invalidAccount = new String[] {".@", "12345", "1234_", "abcde"};


        for (String account : validAccount) {
            System.out.println("Account " + account + " is " + AccountExample.validate(account));
        }

        System.out.println("------------");

        for (String account : invalidAccount) {
            System.out.println("Account " + account + " is " + AccountExample.validate(account));
        }

    }
}
