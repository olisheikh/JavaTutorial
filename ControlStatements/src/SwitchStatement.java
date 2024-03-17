public class SwitchStatement {

    public static void maint(String[] args) {

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value 1");
                break;

            case 2:
                System.out.println("Value 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value 3, 4, 5");
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4, 5");
                break;
        }
    }
}
