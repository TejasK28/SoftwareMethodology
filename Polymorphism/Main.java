package Polymorphism;

class A {
    void display() {
        System.out.println("Class A");
    }
}

class B extends A {
    @Override
    void display() {
        System.out.println("Class B");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new B();
        
        // This will call the overridden display method in class B
        a.display(); // Output: Class B
    }
}
