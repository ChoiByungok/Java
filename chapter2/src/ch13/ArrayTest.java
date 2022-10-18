package ch13;

public class ArrayTest {

    public static void main(String[] args) {

        int[] arr = new int[10];
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i+1);
            System.out.print(arr[i] + "\t");
        }
    }
}
