package datatypes;

public class TestString {
    public static void main(String[] args) {
        // x is pointing to the address of location where 5 is stored.
        int x = 5;

        // in class object the variable contains a new object (i.e., a new address is assigned each time).
        // Each object is stored in a heap memory assigned by the OS to JVM.
        Student student = new Student();
        student.name = "Himanshu";
        student.address = "India";
        student.standard = 12;
        student.rollNumber = 1;
        System.out.println(student.name);

        // Another way to create a string
        String xyz = new String("xyz");
        System.out.println(xyz);

        // Whenever we create a string in double-quotes, a reference for that sequence of characters is created in the
        // string pool in Java. If another variable uses the same string, then both the variables will actually refer
        // to the same reference in the string pool.
        String name = "Ram";
        String name1 = "Ram";
        System.out.println(name == name1); // They are coming equal not because of value but because of same reference
        // in the string pool. Basically, the value "Ram" is created only once in the string pool.

        // However, if we use `new` keyword to create a new String object, then the reference is created in the memory
        // heap. Now because two different memory allocations are made in the heap, the references stored in name3 and
        // name4 are not equal even though they use the exact same reference as "Ram" from the string pool.
        String name3 = new String("Ram");
        String name4 = new String(name1);
        System.out.println(name3 == name4);

    }
}
