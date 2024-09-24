import java.util.Arrays;

public class ArrayTwoDimensional {
    public static void main(String[] args) {
        /*

            2D arrays are a fundamental data structure in Java, allowing you to represent and
            manipulate data in a grid or matrix format.

            * Declaration: int[][] array = new int[rows][columns];

            * Initialization: int[][] array = {{1, 2}, {3, 4}, {5, 6}};

            * Accessing Elements: array[row][column];

            * Modifying Elements: array[row][column] = value;


        */

        // Declaration
        int[][] array_2d = new int[3][4];  // A 2D array with 3 rows and 4 columns

        // Initialization
        int[][] HetroGeneousArray = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int[] row_1 = array_2d[0];
        int[] row_2 = array_2d[1];
        int[] row_3 = array_2d[2];

        row_1[0] = 1;
        row_1[1] = 2;
        row_1[2] = 3;
        row_1[3] = 4;

        row_2[0] = 5;
        row_2[1] = 6;
        row_2[2] = 7;
        row_2[3] = 8;

        row_3[0] = 9;
        row_3[1] = 10;
        row_3[2] = 11;
        row_3[3] = 12;

        int row_1_column_1 = row_1[0];
        int row_1_column_2 = row_1[1];
        int row_1_column_3 = row_1[2];
        int row_1_column_4 = row_1[3];

        int row_2_column_1 = row_2[0];
        int row_2_column_2 = row_2[1];
        int row_2_column_3 = row_2[2];
        int row_2_column_4 = row_2[3];

        int row_3_column_1 = row_3[0];
        int row_3_column_2 = row_3[1];
        int row_3_column_3 = row_3[2];
        int row_3_column_4 = row_3[3];

        System.out.println(Arrays.toString(array_2d[0]));
        System.out.println(Arrays.toString(array_2d[1]));
        System.out.println(Arrays.toString(array_2d[2]));

        for (int rows = 0; rows < array_2d.length ; rows++) {
            for (int columns = 0; columns < array_2d[rows].length ; columns++) {
                System.out.println("Element at row: { " + rows + " } " + "and column { " +
                        columns + " } is : " + array_2d[rows][columns]);
            }
        }

        /*

        */

    }
}
