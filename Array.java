public class Array {
    public static void main(String args[]) {

        // First type array declaration
        int arr[] = new int[10];
        arr[0] = 1;
        arr[1] = 2;

        // Second type array declaration
        int ar2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("For first type declaration");
        for(int i=0; i<arr.length; i++) {
            System.out.println(i + " " + arr[i]);
        }

        System.out.println("For second type declaration");
        for(int i=0; i<arr.length; i++) {
            System.out.println(i + " " + ar2[i]);
        }
        
        // Multi dimensional array
        int ar3[][] = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int ar4[][] = new int[3][3];
        ar4[0][0] = 1;
        ar4[0][1] = 1;
        ar4[1][0] = 1;
        ar4[1][1] = 1;
        ar4[1][2] = 1;
        ar4[2][0] = 1;

        System.out.println("First two dimensional array");
        for(int i=0; i<ar3.length; i++) {
            for(int j=0; j<ar3[i].length; j++) {
                System.out.println("(" + i + ", "+ j + ") " + "--> " + ar3[i][j]);
            }
        }

        System.out.println("Second two dimensional array");
        for(int i=0; i<ar4.length; i++) {
            for(int j=0; j<ar4[i].length; j++) {
                System.out.println("(" + i + ", "+ j + ") " + "--> " + ar4[i][j]);
            }
        }

    }
}
