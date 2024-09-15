package datatypes;

public class StringMethods {
    public static void main(String[] args) {
        // String is immutable in Java. It will remain the same in the string pool.

        String name = "Himanshu Sharma";
        int length = name.length();
        System.out.printf("The length of the string '%s' is %d.\n", name, length);
        String name2 = "himanshu Sharma";

        // equals will check even the cases of the characters.
        System.out.println(name.equals(name2));
        // ignore case will ignore the character casing. It is used industry-wide.
        System.out.println(name.equalsIgnoreCase(name2));

        // compareTo function
        String str1 = "remote";
        String str2 = "car";
        // compareTo function compares the string character-wise. If the characters are different, it returns the
        // difference in the ASCII values of the two characters. If they are same characters, it moves to the next
        // character and does the same.
        int i = str1.compareTo(str2);
        System.out.println(i);

        // getting substrings
        String name3 = "Stephen Hawking";
        System.out.println(name3.substring(5));
        System.out.println(name3.substring(7, 10)); // end index is excluded.
        // uppercase and lowercase - will return a new string
        System.out.println(name3.toUpperCase());

        // trimming will return a new string.
        String name4 = "  Electrical Engineering       ";
        System.out.println(name4.trim());

        // Replacing strings
        String name5 = name4.replace("Electrical", "Electronics");
        System.out.println(name5);

        // contains
        System.out.println(name4.contains("Engineering"));

        // startsWith
        System.out.println(name3.startsWith("Steph"));
        System.out.println(name3.endsWith("ing"));

        // number to string
        int a = 5;
        String s = String.valueOf(a);
        System.out.println(s);

        // string formatting using .format
        System.out.println(String.format("We have %d books.", 10));
    }
}
