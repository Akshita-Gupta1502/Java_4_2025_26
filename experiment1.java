class Student {
    int rollNo;
    String name;
    double marks;

    Student() {
        rollNo = 101;
        name = "Akshita";
        marks = 90.0;
    }

    Student(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display();

        Student s2 = new Student(102, "Nitin", 89.5);
        s2.display();
    }
}
