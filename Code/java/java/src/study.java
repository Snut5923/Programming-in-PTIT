class Student {
    private String name;
    private int age;

    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class study {
    public static void main(String[] args) {
        Student s1 = new Student("Linh", 24);
        s1.show();
    }
}