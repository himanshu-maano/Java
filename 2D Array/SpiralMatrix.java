
public class SpiralMatrix {
    public static void spiralMatrix (int arr[][]) {
        int startRow = 0;
        int endRow = arr.length-1;
        int startCol = 0;
        int endCol = arr[0].length-1;
        while(startRow <= endRow && startCol <= endCol ) {
            // top border
            for(int j=startCol; j<=endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            startRow++;

            // last col
            for(int i=startRow; i<=endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            endCol--;

            // last row
            for(int j=endCol; j>=startCol; j--) {
                // if(startRow == endRow) {
                //     break;
                // }
                System.out.print(arr[endRow][j] + " ");
            }
            endRow--;

            // startColumn
            for(int i=endRow; i>=startRow; i--) {
                // if(startCol == endCol) {
                //     break;
                // }
                System.out.print(arr[i][startCol] + " ");
            }
            startCol++;
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                       {5,6,7},
                       {9,10,11},
                       {13,14,15}};
        spiralMatrix(arr);
    }
}
