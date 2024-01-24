package array;

public class ArrayDi4 {
    public static void main(String[] args) {

        // 2 * 3  2 차원 배열을 만든다.
        int[][] arr = new int[4][4]; // 행2, 열3

        int i = 1;
        for(int row=0; row < arr.length; row++){

            for(int column=0; column<arr[row].length; column++){
              arr[row][column] = i++;
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }

    }
}
