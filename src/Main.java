import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        //task 1
        int sum = 0;
        for (int k : arr) {
            sum = sum + k;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //task 2
        int min = 200001;
        int max = 0;
        for (int k : arr) {
            if (k > max) {
                max = k;
            }
            if (k < min) {
                min = k;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей" +
                "\nМаксимальная сумма трат за день составила " + max + " рублей.");

        //task 3
        float floatSum = sum;
        float average = floatSum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        //task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println();
        for (int i = reverseFullName.length -1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

        //task 5
        System.out.println();
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix.length - i - 1 == j || i == j) {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        //task 6
        int[] wrongArray = {5, 4, 3, 2, 1};
        int[] correctArray = new int[5];
        for (int i = 0; i < wrongArray.length; i++) {
            correctArray[i] = wrongArray[wrongArray.length - i - 1];
        }
        System.out.println(Arrays.toString(wrongArray));
        System.out.println(Arrays.toString(correctArray));

        //task 7
        System.out.println();
        System.out.println(Arrays.toString(wrongArray));
        for (int i = 0; i < wrongArray.length/2; i++) {
            int tempInt = wrongArray[i];
            wrongArray[i] = wrongArray[wrongArray.length - i - 1];
            wrongArray[wrongArray.length - i - 1] = tempInt;
        }
        System.out.println(Arrays.toString(wrongArray));

        //task 8
        int[] task8Arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        finish: for (int i = 0; i < task8Arr.length; i++) {
            for (int j = 0; j < task8Arr.length; j++) {
                if (i != j && task8Arr[i] + task8Arr[j] == -2) {
                    System.out.println("Первая подхдящая под условие пара чисел это " + task8Arr[i] + " и " + task8Arr[j]);
                    break finish;
                }
            }
        }

        //task 9
        for (int i = 0; i < task8Arr.length; i++) {
            for (int j = 0; j < task8Arr.length; j++) {
                if (i != j && task8Arr[i] + task8Arr[j] == -2) {
                    System.out.println("Подхдящая под условие пара чисел это " + task8Arr[i] + " и " + task8Arr[j]);
                }
            }
        }


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}