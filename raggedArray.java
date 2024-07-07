// Ragged array is an array with more than one dimension each dimesion has different size.
// There is no requirement that all rows in a two-dimensional array have the same length
// An array with rows of non-uniform length is known as ragged array
public class raggedArray {
    public static void main(String[] args) {

        int regArr[][] = new int[3][];
        regArr[0] = new int[5];  // Here we dcide the size of array row of index 0
        regArr[1] = new int[3];
        regArr[2] = new int[2];

        regArr[0][0] = 1;
        regArr[0][1] = 2;
        regArr[0][2] = 3;
        regArr[0][3] = 4;
        regArr[0][4] = 5;

        regArr[1][0] = 1;
        regArr[1][1] = 2;
        regArr[1][2] = 3;

        regArr[2][0] = 1;
        regArr[2][1] = 2;
        
        for(int i=0; i<regArr.length; i++) {
            for(int j=0; j<regArr[i].length; j++) {
                System.out.println("(" + i + ", "+ j + ") " + "--> " + regArr[i][j]);
            }
        }
        
    }
}
