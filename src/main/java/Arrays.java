public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for(int i=0; i< numbers.length; i++){
            numbers[i] = i*10;
        }
        for(int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers2 = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i< numbers2.length; i++){
            System.out.println(numbers2[i]);
        }
    }
}
