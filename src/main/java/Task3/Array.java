package Task3;

public class Array {
    public static void main(String[] args) {
        //Task1
        double[] arr = {5, 9, 3, 2, 0, -4, -8.3, 3, -4};
        double max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println();


        //Task2
        int[] intArr = {1, 6, 3, 3, 4, 5, 5, 6, 0};
        java.util.Arrays.sort(intArr);
        int[] counts = new int[max(intArr) + 1];

        for (int i = 0; i < intArr.length; i++) {
            counts[intArr[i]]++;
        }

        for (int i = 0; i < intArr.length; i++) {
            if(counts[intArr[i]] == 1) System.out.print(intArr[i] + " " + System.lineSeparator());
        }
        System.out.println();



        //Task3
        String[] strArr = {"12","23","34","12", "56", "67"};
        String str = strArr[0];
        String test = "12";

        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i] == test) {
                strArr[i] = "replaced";
            }
            System.out.println(strArr[i] + "");
        }
        System.out.println();

        //Task4
        String[] revStr = {"1","2","3","4","5"};

        for(int i = 0; i < revStr.length; i++) {
            System.out.println(revStr[i]);


        }
        System.out.println();
        int n = revStr.length;
        for (int i = 0; i < n / 2; i++) {
            String temp = revStr[n - i - 1];
            revStr[n - i - 1] = revStr[i];
            revStr[i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(revStr[i]);
        }

    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }
}
