package humans;

public class Test {
    public static void main(String[] args) {
        // Multi-level Inheritance; Child <--- Parent <--- GrandParent
        //
        // Note that `new` keyword is used to dynamically create object during runtime and not on
        // compile time.
        Child child = new Child(); // this will also print the order of constructor calls.
        // please note that only the properties are inherited and not the actual values.
        child.setName("Ram"); // this is the name of the `child` and not that of a GrandParent.
        child.setAge(5); // same here.
        child.childMethod();
    }
}
