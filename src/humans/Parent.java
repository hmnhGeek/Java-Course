package humans;

public class Parent extends GrandParent {
    public Parent() {
        super(); // this function calls the constructor of the parent class and is hidden always.
        // this function should always be the first to be called in the constructor of the child
        // class. Note that it is useful when there is no default constructor in the parent class.
        System.out.println("Parent() constructor called.");
    }

    public void parentMethod() {
        System.out.println("Parent method called.");
    }
}
