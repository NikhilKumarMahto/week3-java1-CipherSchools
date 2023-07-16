abstract class Car {
    int maxSpeed;
    abstract void accelerate();
    abstract void brake();
}

abstract class BMW extends Car {
    void accelerate() {
        System.out.println("BMW is accelerating");
    }
}

class BMW2 extends BMW {
    void brake() {
        System.out.println("BMW is braking");
    }
}

abstract class A {
    int x = 10;
    void fun() {
        System.out.println("Hello");
    }
}

public class ClassTwelve {
    public static void main(String[] args) {
        // Car c = new Car();
        // BMW b = new BMW();

    }
}
