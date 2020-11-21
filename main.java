import java.util.Arrays;

public class Main {
    /*
    Create a method that, given a picture (represented by a 2-D array), flips the picture.
    To accomplish flipping the picture, reverse the nested array and return the full array.

    Input: [[1,1,0],[1,0,5],[0,0,0]]
    Output: [[0,1,1],[5,0,1],[0,0,0]]


    Input: [[1,2,3],[5,6,7],[7,8,8]]
    Output: [[3,2,1],[7,6,5],[8,8,7]]


    1 (optional). Have a variable to represnt the output which will have a
    length of the array in the parameter
    2 (optional). Have a variable to represent each array that will be added to the output
    3. For loop that iterates from the front of the outer array to the end
    4. Nested for loop that starts at the end of the nested array
         */
    public static void main(String[] args) {
        int [][] input = {{1,1,0},{1,0,5},{0,0,0}};
        int [] [] actual = flippingImage(input);
        Arrays.stream(actual[0]).forEach(element-> System.out.print(element));
        Arrays.stream(actual[1]).forEach(element-> System.out.print(element));
        Arrays.stream(actual[2]).forEach(element-> System.out.print(element));

    }
    public static int [][] flippingImage (int[][] input){
        int row = input.length;
        int column = input[0].length;
        for(int i=0; i<row; i++) {
            int columnIndex =0;
            for(int j=column-1; j > columnIndex; j--) {
                int temp = input[i][j];
                input[i][j] = input[i][columnIndex];
                input[i][columnIndex] = temp;
                columnIndex++;
            }
        }
        return input;
    }

}
