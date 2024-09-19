package Conditionals;

public class SwitchAndIfElse {
    public static void main(String[] args) {
        int day = 1;

        // if-else conditions check sequentially starting from first if till the end. It's like a linked list traversal.
        if(day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Invalid day!");
        }

        // switch statements direct access; however, once it finds a case, it will evaluate all the cases post the
        // valid case as well. If you don't want that behaviour, include a break statement after each case.
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid day!");
        }
    }
}
