package Methods;

public class Methods {
    public static void main(String[] args) {
        int[] arr1 = {2,9,0,4,7,0,9,3};
        System.out.println(sumOfArray(arr1));

        int[] arr2 = {7,8,5,9,7,3,4,1,2,0,3,6,5,8,9,6,4,7};
        System.out.println(sumOfArray(arr2));

        System.out.println(trimAndUpper("         Electrical      "));

        System.out.println(sum(1, 5));
        System.out.println(sum(190, 35, 1));
        System.out.println(sum(10.38f, 287.3728f));
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    public static int sumOfArray(int[] arr) {
        int sum = 0;

        for(int i:arr) {
            sum += i;
        }

        return sum;
    }

    private static String trimAndUpper(String str) {
        return str.trim().toUpperCase();
    }

    // METHOD OVERLOADING
    // Here, two methods with exact same definitions have been defined but only the number of parameters have changed.
    // This is called method overloading.
    private static int sum(int a, int b) {
        return a + b;
    }

    private static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // types can also be different or a combination of both
    private static float sum(float a, float b) {
        return a + b;
    }

    // method and its parameters are collectively called SIGNATURE. A signature does not include access modifier and
    // the return type of the method. Overloading is applicable only when the signature is different.

    // passing multiple arguments: same as **kwargs and *args in Python.
    // private static int sum(int ... a) {
    // private static int sum(int ...a) {
    // all mean the same.
    private static int sum(int... a) {
        int s = 0;
        for(int i:a) {
            s += i;
        }
        return s;
    }
}
