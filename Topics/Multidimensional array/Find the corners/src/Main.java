class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        int[][] x = {
                {twoDimArray[0][0], twoDimArray[0][twoDimArray[0].length - 1]},
                {twoDimArray[twoDimArray.length - 1][0],
                        twoDimArray[twoDimArray.length - 1][twoDimArray[twoDimArray.length - 1].length - 1]},
        };

        for (int[] i : x) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}