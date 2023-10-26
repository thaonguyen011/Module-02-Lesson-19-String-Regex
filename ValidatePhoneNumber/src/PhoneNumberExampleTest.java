public class PhoneNumberExampleTest {
    public static void main(String[] args) {
        String[] validPhoneNumber = new String[] {"(84)-(0978489648)"};
        String[] invalidPhoneNumber = new String[] {"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

        for (String phoneNumber : validPhoneNumber) {
            System.out.println("PhoneNumber " + phoneNumber + " is " + PhoneNumberExample.validate(phoneNumber));
        }

        System.out.println("______________");

        for (String phoneNumber : invalidPhoneNumber) {
            System.out.println("PhoneNumber " + phoneNumber + " is " + PhoneNumberExample.validate(phoneNumber));
        }


    }
}
