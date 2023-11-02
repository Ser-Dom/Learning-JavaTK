public class StringBuilder23 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my friend.").append(" You are nice");
        System.out.println(sb.toString());

        System.out.printf("This is a string, %s", "Nice");
        System.out.printf("This is a string, %d", 3453);
        System.out.printf("%f This is a string, %d \n", 3453.546, 234);

        System.out.printf("This is a string, %10d \n" , 1);
        System.out.printf("This is a string, %10d \n", 100000000);

        System.out.printf("%.2f \n", 45.337);
    }
}
