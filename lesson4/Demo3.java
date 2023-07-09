class Student {
    String name;
    int rollNo;
    int marks;
}

public class Demo3 {
    public static void main(String a[]) {
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Rohan";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Ren";
        s2.marks = 94;

        // To create an array of students
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;

    }
}
