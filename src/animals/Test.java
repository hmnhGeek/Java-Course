package animals;

public class Test {
    public static void main(String[] args) {
        // if you carefully observe, the name and age properties are being inherited from the Animal class.
        Dog dog = new Dog();
        dog.setName("Tommy");
        dog.setAge(5);
        System.out.println(String.format("%s the dog is %d years old.", dog.getName(), dog.getAge()));
    }
}
