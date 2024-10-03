package abstraction;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sayHello();

        // but you cannot directly instantiate an abstract class.
        // Animal animal = new Animal();
    }
}
