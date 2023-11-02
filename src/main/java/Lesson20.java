public class Lesson20 {
    public static void main(String[] args) {
        Human2 human1 = new Human2("Bob", 22);
        Human2 human2 = new Human2();

        System.out.println(human1.getAge() + human1.getName());
        System.out.println(human2.getAge() + human2.getName());

        Human2.description = "Nice man";
        Human2.getDescription();
        human1.getAllFields();
        human2.getAllFields();
        Human2.description = "Bad man";
        human1.getAllFields();
        human2.getAllFields();
        Human2.printNumPep();
    }
}
class Human2 {

    private String name;
    private int age;
    public static String description;
    public static int countPeople;

    public Human2(){
        this.name = "Default name";
        this.age = 18;
        countPeople++;
    }

    public Human2(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) { this.name = name;  }
    public void setAge(int age) { this.age = age;  }
    public String getName() { return name;  }
    public int getAge() {  return age;  }

    public static void getDescription(){
        System.out.println(description);
    }
    public void getAllFields(){
        System.out.println(name + ", " + age + ", " + description);
    }

    public static void printNumPep(){
        System.out.println(countPeople);
    }
}