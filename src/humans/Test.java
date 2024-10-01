package humans;

public class Test {
    public static void main(String[] args) {
        // Multi-level Inheritance; Child <--- Parent <--- GrandParent
        Child child = new Child(); // this will also print the order of constructor calls.
        // please note that only the properties are inherited and not the actual values.
        child.setName("Ram"); // this is the name of the `child` and not that of a GrandParent.
        child.setAge(5); // same here.
    }
}
