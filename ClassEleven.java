class A {
    final int noOfAlphabets = 26;
    final int noOfDigits;

    A() {
        noOfDigits = 10;
    }

    public void fun() {
        System.out.println("Hi, I am function in class A");
    }
}

final class B extends A {
    // void fun() {
    //     System.out.println("Function overriding");
    // }
}

public class ClassEleven {
    public static void main(String[] args) {
         
    }
}
