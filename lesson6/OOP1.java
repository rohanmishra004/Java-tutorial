
class A extends Object {

    public A(int n) {
        super();
        System.out.println(
                "in int A");
    }

    public A() {
        System.out.println("in A");
    }
}

class B extends A {

    // This constructor will be called once we create a new instance of class B
    public B() {
        System.out.println("in B");
    }

    public B(int n) {
        System.out.println("in int B");
    }
}

public class OOP1 {

    // Since B extends from A , so the constructor of A is called first and then B
    public static void main(String a[]) {
        B obj1 = new B(1);
    }
}