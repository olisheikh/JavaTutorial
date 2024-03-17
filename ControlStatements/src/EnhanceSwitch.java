public class EnhanceSwitch {

    public static void main(String[] args) {

        String month = "January";

        switch(month) {

            case  "January" ->
                System.out.println("1st");
            case "February" ->
                System.out.println("2nd");
            default -> System.out.println("Bad");
        }
    }
}
