package humans;

public class Child extends Parent {
    public Child() {
        System.out.println("Child() constructor called.");
    }

    public void childMethod() {
        System.out.println("Child method called.");
        super.parentMethod(); // this can be used to call the parent methods in child class.
        // here the super keyword can be used in any line.
    }
}
