public class ClassnameExampleTest {
    public static void main(String[] args) {
        String[] validClass = new String[] {"C0223G", "A0323K"};
        String[] invalidClass = new String[] {"M0318G", "P0323A"};

        for (String classname : validClass) {
            System.out.println("Class " + classname + " is " + ClassnameExample.validate(classname));
        }

        System.out.println("---------");

        for (String classname : invalidClass) {
            System.out.println("Class " + classname + " is " + ClassnameExample.validate(classname));
        }
    }
}
