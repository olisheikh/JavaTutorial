import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String age = input.nextLine();

        System.out.println(Integer.parseInt(age));

    }
}
