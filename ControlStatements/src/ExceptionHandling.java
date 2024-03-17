public class ExceptionHandling {

    public static void main(String[] args) {

        try {
            String age = System.console().readLine("Enter your age: ");
            System.out.println("Your age is: " + age);
        } catch (Exception e) {
            System.out.println("This is an error: " + e.getMessage());
        }
    }
}
