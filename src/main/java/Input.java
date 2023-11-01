import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Input something");
        String string = s.nextLine();
        System.out.println("You inputted: "+string);
        System.out.println("Input digits");
        int x = s.nextInt();
        System.out.println("You inputted: "+x);

    }
}
