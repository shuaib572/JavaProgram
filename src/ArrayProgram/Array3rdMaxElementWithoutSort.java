package ArrayProgram;

public class Array3rdMaxElementWithoutSort {

    public static void main(String[] args) {

        int arr[] = { 1, 9, 55, 3, 5, 21, 11 };
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if (arr[i] > thirdMax && arr[i] != secondMax && arr[i] != firstMax) {
                thirdMax = arr[i];
            }
        }

        if (thirdMax != Integer.MIN_VALUE) {
            System.out.println("The third maximum element is: " + thirdMax);
        } else {
            System.out.println("There is no third maximum element in the array.");
        }
    }
}

