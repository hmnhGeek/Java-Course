package Arrays;

public class Arrays {
    public static void main(String[] args) {
        // defining an array in Java of size 10. There are other ways also of declaring the same array.
        // int []arr, int arr[].
        int[] arr = new int[10];

        // note that whenever `new` keyword is used, it implies a memory usage in Heap memory.
        // A primitive value like a reference is stored in the stack memory.

        // we can assign the value to array items
        arr[7] = 88;
        arr[5] = 91;

        // arr.length gives the length of the array. It is a property variable of the arr object.
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // direct way of initializing an array
        int arr1[] = {1, 12, 3, 4};
        System.out.println(arr1[2]);

        // to directly reference the numbers in the array
        for(int i: arr1) {
            System.out.println(i);
        }

        // declaring a matrix in Java
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // for printing this matrix
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // A jagged array is that in which we have different number of columns in a single matrix
        int[][] jaggedArray = new int[3][];

        // if you note carefully, we haven't defined the number of columns
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[10];
        jaggedArray[2] = new int[5];

        for(int i = 0; i < jaggedArray.length; i++) {
            for(int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
