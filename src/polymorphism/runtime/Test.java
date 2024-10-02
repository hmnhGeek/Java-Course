package polymorphism.runtime;

public class Test {
    public static void main(String[] args) {
        // This is the parent class and so, `makeSound()` of parent is called.
        Animal animal = new Animal();
        animal.makeSound();

        // This is the child class and so, `makeSound()` of child is called.
        Dog dog = new Dog();
        dog.makeSound();

        // However, here we have referenced the type as `Animal`, but instantiated
        // an object of a child class `Dog`. At runtime, `new` keyword dynamically
        // creates an object of class Dog only. And thus, the `makeSound()` method
        // of the Dog class is called. This is therefore called runtime polymorphism.
        // This is popularly known as Method Overloading.
        Animal dog1 = new Dog();
        dog1.makeSound();
    }
}
