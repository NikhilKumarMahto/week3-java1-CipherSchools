interface Shape {
    double pi = 3.14;
    double getSquare(double side);
}

class Circle implements Shape {
    public double getSquare(double r) {
        return r * r;
    }

    void fun() {
        System.out.println("Hey, I implemented an interface named Shape");
    }
}

interface M {
    int x = 10;
    void fun();
}

interface N {
    int x = 20;
    void fun();
}

class C implements M,N {
    public void fun() {
        System.out.println("Hello, I am function in c");
        System.out.println(M.x);
        System.out.println(N.x);
        System.out.println(M.super.hashCode());
        System.out.println(N.super.hashCode());
    }
}

public class ClassThirteen {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getSquare(5));
        c.fun();

        C c1 = new C();
        c.fun();
    }
}
