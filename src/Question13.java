public class Question13 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] rowSums = new int[3];
        int[] colSums = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rowSums[i] += array[i][j];
                colSums[j] += array[i][j];
            }
        }

        System.out.println("행의 합:");
        for (int sum : rowSums) {
            System.out.println(sum);
        }

        System.out.println("열의 합:");
        for (int sum : colSums) {
            System.out.println(sum);
        }
    }
}

