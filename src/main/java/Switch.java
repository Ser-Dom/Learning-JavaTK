import java.util.Scanner;

/*public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your age");
        int age = scanner.nextInt();
        switch (age){
            case 5:
                System.out.println("You are newborn");
                break;
            case 7:
                System.out.println("You are schoolboy");
                break;
            case 18:
                System.out.println("You finished the school");
                break;
            default:
                System.out.println("No one from conditions are not correct");
        }
    }
}*/

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your age");
        String age = scanner.nextLine();
        switch (age){
            case "zero":
                System.out.println("You are newborn");
                break;
            case "seven":
                System.out.println("You are schoolboy");
                break;
            case "eighteen":
                System.out.println("You finished the school");
                break;
            default:
                System.out.println("No one from conditions are not correct");
        }
    }
}