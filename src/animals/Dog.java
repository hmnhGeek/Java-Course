package animals;

public class Dog extends Animal {
    // @Override annotation helps in avoiding error and ensures that certain methods of parent class
    // are implemented in the child class.
    @Override
    public void sayHello() {
        System.out.println("Woof woof!");
    }
}
