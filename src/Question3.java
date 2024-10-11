public class Question3 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        System.out.println("배열의 합: " + sum);
    }
}

