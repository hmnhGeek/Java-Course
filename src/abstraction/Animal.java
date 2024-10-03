package abstraction;

public abstract class Animal {
    // an abstract method does require an abstract class. This helps us to avoid writing
    // unnecessary code in parent class.
    public abstract void sayHello();

    // an abstract class can have normal declared and defined methods as well.
    // Basically these methods are called concrete methods.
    public void sleep() {
        System.out.println("zzz...");
    }
}
