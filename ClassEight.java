class Student {
    String name;
    int marks;
    boolean checkPass() {
        if(marks >= 40) return true;
        return false;
    }
}

class Car {
    String name;
    String color;
    int year;
    int maxSpeed;
    void accelerate() {
        System.out.println("Car is accelerating");
    }
}

public class ClassEight {

    static int findMax(int a, int b, int c) {
        if(a>b) {
            if(a > c) return a;
            else return c;
        } else {
            if(b>c) return b;
            else return c;
        }
    } 

    public static void main(String[] args) {
        Car polo = new Car();
        System.out.println(polo.name);
        System.out.println(polo.color);
        System.out.println(polo.year);
        System.out.println(polo.maxSpeed);

        polo.name = "Polo";
        polo.color = "RED";
        polo.year = 2016;
        polo.maxSpeed = 120;

        System.out.println(polo.name);
        System.out.println(polo.color);
        System.out.println(polo.year);
        System.out.println(polo.maxSpeed);


        Student s1 = new Student();
        s1.name = "Ram";
        s1.marks = 80;

        Student s2 = new Student();
        s2.name = "Sham";
        s2.marks = 30;

        System.out.println(s1.checkPass());
        System.out.println(s2.checkPass());

        System.out.println(ClassEight.findMax(10, 20, 30));


        // switch

        char c = 'a';

        switch(c) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            case 'f':
                System.out.println("F");
                break;
            case 'g':
                System.out.println("G");    
        }

    }
}
