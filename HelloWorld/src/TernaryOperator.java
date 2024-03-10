public class TernaryOperator {

    public static void main(String[] args) {

        boolean isOdd = 20 % 2 != 0 ? true : false;

        if (isOdd) {
            System.out.println("Odd number.");
        }

        if (!isOdd) {
            System.out.println("Even Number.");
        }
    }
}
