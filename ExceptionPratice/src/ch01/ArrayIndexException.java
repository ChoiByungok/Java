package ch01;

public class ArrayIndexException {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("배열의 범위를 벗어났습니다.");
            System.out.println(e.getMessage());
        }
    }
}
