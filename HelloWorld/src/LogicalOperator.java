public class LogicalOperator {

    public static void main(String[] args) {

        int age = 20;
        boolean isValid = true;

        /**
         * Logical AND operator.
         */
        if (isValid && age > 18) {
            System.out.println("Your are allowed.");
        }

        /**
         * Logical AND & OR operator.
         */
        if (isValid && age >18 || age < 15) {
            System.out.println("Your are partially allowed");
        }

        /**
         * Logical NOT operator.
         */
        if (!isValid) {
            System.out.println("You are not allowed");
        }
    }
}
