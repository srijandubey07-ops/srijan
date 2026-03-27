public class CWH_28_MULTI_dimention_array {
    static void main(String[] args) {
        int [][] flate = new int[2][3];
        flate [0][0] =101;
        flate [0][1] =102;
        flate [0][2] =103;
        flate [1][0] =104;
        flate [1][1] =105;
        flate [1][2] =106;
        // Displaying the 2-D array (for loop)
        System.out.println("printing 2-D array");
        for (int i = 0 ; i< flate.length; i++) {
            for (int j = 0; j < flate[i].length; j++) {
                System.out.print(flate[i][j]);
                System.out.print(" ");
            }

            System.out.println("\n");
        }

    }
}
