package sort.selectionsort;

/**
 * - Bubble Sort sắp xếp dựa dựa trên cách cho phần tử đầu tiên là min, nếu có phần tử nhỏ hơn trong
 * những phần tử còn lại của mảng thì cho đó là phần tử nhỏ nhât, lần lượt duyệt và tìm các phần tử
 * còn lại, sử dụng mảng 2 chiều nên độ phức tạp thuật toán là rất cao O(n^2)
 * <p>
 * - Bubble Sort không thực sự hiệu quả kể cả khi với một mảng nhỏ, vì độ phức tạp quá lớn khi duyệt lần
 * lượt và so sánh 2 phần tử gần nhau => nên sử dụng các giải thuật tìm kiếm khác.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        selectionSort(array);

        // In ra sau khi sắp xếp
        for (int i : array) {
            System.out.print(i);
        }
    }

    // Selection Sort
    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }

    }
}
