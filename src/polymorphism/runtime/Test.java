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
        // This is popularly known as Method Overloading. Also called Dynamic Method
        // Dispatch or Up-Casting.
        Animal dog1 = new Dog();
        dog1.makeSound();

        // However, dog1 cannot access exclusive methods to the Dog class.
        // dog1.eat(); <--- this won't work because the reference is given that of Animal.

        // However, this cannot be done.
        // Dog dog = new Animal();

        // There is also something called as Down-Casting.
        Dog dog2 = (Dog) dog1; // here, a reference to a parent class Animal is down-casted
        // to a Dog class which is a child class.
    }
}
