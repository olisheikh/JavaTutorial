public class WhileStatement {
    public static void main(String[] args) {

        hasSharedDigit(12, 13);
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0)
            return true;
        return false;
    }

    public static void checkEven() {
        int i = 5;
        while (i <= 20) {
            if (isEven(i))
                System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    public static void sumDigits(int num) {
        int sum = 0;

        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println(sum);
    }
    public static boolean isPalindrome(int number) {

        int newNumber = number;
        int reversedNum = 0;

        while (newNumber != 0) {
            reversedNum += (10 * (newNumber % 10));
            newNumber /= 10;
        }

        if (reversedNum == number)
            return true;

        return false;
    }

    public static boolean hasSharedDigit(int firstNum, int secondNum) {

        int firstCheck = 0;
        int secondCheck = 0;

        if (firstNum <= 9 || firstNum > 99 || secondNum <= 9 || secondNum > 99)
            return false;

        while (firstNum != 0) {
            firstCheck = firstNum % 10;

            while (secondNum != 0) {
                secondCheck = secondNum % 10;

                if (firstCheck == secondCheck) {
                    return true;
                }

                secondNum /= 10;
            }

            firstNum /= 10;
        }

        return false;
    }
}
