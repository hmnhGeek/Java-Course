package polymorphism.runtime;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }

    public void eat() {
        System.out.println("Dog is eating!");
    }
}
