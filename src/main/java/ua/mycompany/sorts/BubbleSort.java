package ua.mycompany.sorts;

public class BubbleSort implements Sort {

    // -100  0 9 2 -1
    //   0   -100  9  2 -1
    //  0   9   -100 2 -1
    // 0 9 2 -100 -1
    // 0 9 2  -1  -100

    @Override
    public void sort(int... arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i-1; j++) {///

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        bubbleSort.sort(-100, 0, 9, 2, -1);
    }
}
