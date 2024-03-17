import java.util.Scanner;

public class Problems {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        while (true) {
            try{
                Scanner input = new Scanner(System.in);

                int number = input.nextInt();

                sum += number;
                count++;

            } catch (Exception num) {
                System.out.println("SUM = " + sum + " AVG = " + (sum / count));
                break;
            }
        }
            }

        }


