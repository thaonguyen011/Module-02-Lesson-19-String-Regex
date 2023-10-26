public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[] {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[] {"gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is " + isValid);
        }
        System.out.println("---------");
        for (String email : invalidEmail) {
            boolean isInvalid = emailExample.validate(email);
            System.out.println("Email is " +email + " is " + isInvalid);
        }
    }
}
