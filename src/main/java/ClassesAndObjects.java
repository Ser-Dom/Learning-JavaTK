public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(0);
        person1.present();
    }
}
class Person{
    private String name;
    private int age;

    public void setName(String userName){
       if (userName.isEmpty()){
            System.out.println("Field name is empty");
        } else{ name = userName;}
    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        if(userAge > 0){
            age = userAge;;
        } else {
            System.out.println("Age is incorrect");
        }

    }
    public int getAge(){
        return age;
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


