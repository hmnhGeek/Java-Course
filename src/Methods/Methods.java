package Methods;

public class Methods {
    public static void main(String[] args) {
        int[] arr1 = {2,9,0,4,7,0,9,3};
        System.out.println(sumOfArray(arr1));

        int[] arr2 = {7,8,5,9,7,3,4,1,2,0,3,6,5,8,9,6,4,7};
        System.out.println(sumOfArray(arr2));
    }

    public static int sumOfArray(int[] arr) {
        int sum = 0;

        for(int i:arr) {
            sum += i;
        }

        return sum;
    }
}
