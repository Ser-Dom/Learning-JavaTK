public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Roman",45);
        person1.sayHello();
        Person person2 = new Person();
        String s2 = "Vovka";
        person2.setNameAndAge(s2,22);
        person2.present();
        person1.present();

        int year1 = person1.calculateYearsRetired();
        int year2 = person2.calculateYearsRetired();
        System.out.println("First man to retired is "+year1);
        System.out.println("Second man to retired is "+year2);

    }
}
class Person{
    String name;
    int age;

    void setNameAndAge(String username, int ageN){
        name = username;
        age = ageN;
    }

    int calculateYearsRetired(){
        int years = 65 - age;
        return years;
    }
    void present(){
        for(int i=0; i<2; i++) {
            System.out.println("My name is " + name + ", I'm " + age + " years old");
        }
    }
    void sayHello(){
        System.out.println("Hello");
    }

}


