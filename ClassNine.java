class A {
    int a,b;

    public void show() {
        System.out.println("Hello");
    }
}

class B extends A {
    int c,d;
    public void write() {
        System.out.println("Writing");
    }
}

class C extends B {
    int e,f;
    public void speak() {
        System.out.println("Speaking");
    }
}

class D extends C {
    int g,h;
    public void eat() {
        System.out.println("Eating");
    }
}

public class ClassNine {
    public static void main(String[] args) {
        D d = new D();
        B b = new B();
        C c = new C();
    }
}
