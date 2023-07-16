class Student  {
    int roll;
    String name;
    static int count = 0;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
        count++;
    }

    public void showCount() {
        System.out.println(roll);
        System.out.println(count);
    }
}

public class ClassTen {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Ram");
        System.out.println(s1.count);
        Student s2 = new Student(1, "Ram");
        System.out.println(s1.count);
        Student s3 = new Student(1, "Ram");
        System.out.println(s1.count);
    }
}
