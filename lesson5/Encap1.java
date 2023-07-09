class Human {

    // Private Variables so that they are hidden from outer code
    private int age;
    private String name;

    // Even if we dont mention it Java automatically creates a default constructor -
    // but here we are providing default value to it so even if we donot provide any
    // value to the object it will take default value
    public Human() {
        age = 12;
        name = "John";
    }

    // Parameterized Constructor - Constructors that take parameters , by using
    // Contructor Overloading we can assign values directly while instantiting the
    // object
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Functions to access private instance variables
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setValues(int age, String name) {
        this.age = age;
        this.name = name;
    }

}

public class Encap1 {
    public static void main(String a[]) {
        Human obj = new Human();
        Human obj1 = new Human();
        Human obj2 = new Human(15, "user2");

        obj1.setValues(11, "User");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());

    }
}
