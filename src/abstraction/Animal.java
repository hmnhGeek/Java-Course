package abstraction;

public abstract class Animal {
    // an abstract method does require an abstract class. This helps us to avoid writing
    // unnecessary code in parent class. Also note that `protected` access modifier is
    // used to specify that this method can only be accessed by those classes which extend
    // this class. `protected` keyword can be used on abstract as well as on a normal class.
    protected abstract void sayHello();

    // an abstract class can have normal declared and defined methods as well.
    // Basically these methods are called concrete methods.
    public void sleep() {
        System.out.println("zzz...");
    }
}
