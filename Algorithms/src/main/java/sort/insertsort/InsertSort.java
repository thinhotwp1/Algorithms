package sort.insertsort;

/**
 * - Insertion Sort xét từng phần tử trong array với các phần tử trước nó
 * nếu phần tử trước nó lớn hơn phần tử đang xét thì đổi chỗ cho nhau giá trị.
 *
 * - Độ phức tạp thuật toán là O(n^2), phù hợp với data nhỏ, ít bước hơn bubble sort.
 */
public class InsertSort {
    public static void main(String[] args) {
        int array[] = {3, 1, 2, 8, 7, 9, 6, 4, 5};

        insertionSort(array);

        // In ra sau khi sắp xếp
        for (int i : array) {
            System.out.print(i);
        }
    }

    // Selection Sort
    private static void insertionSort(int[] array) {
        /**
         * - Ví dụ dưới khi xét từ vị trí  i = 1 có temp = 1, j = 0, với array[j] > temp (3>1) thì đổi chỗ
         * cho nhau, lần lượt xét tới cuối
         */

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }

    }
}