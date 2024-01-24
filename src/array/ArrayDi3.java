package array;

public class ArrayDi3 {
    public static void main(String[] args) {

        // 2 * 3  2 차원 배열을 만든다.
        int[][] arr = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        }; // 행2, 열3

//        arr[0][0] = 1; // 0행 0열
//        arr[0][1] = 2; // 0행 0열
//        arr[0][2] = 3; // 0행 0열
//        arr[1][0] = 4; // 0행 0열
//        arr[1][1] = 5; // 0행 0열
//        arr[1][2] = 6; // 0행 0열

        for(int row=0; row < arr.length; row++){

            for(int column=0; column<arr[row].length; column++){
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }

    }
}
