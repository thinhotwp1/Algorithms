package sort.bubblesort;

/**
 * - Bubble Sort sắp xếp dựa theo 2 phần tử cạnh nhau, nếu phần tử sau nhỏ hơn phần tử trước thì
 * đổi chỗ, lần lượt tới index cuối, sử dụng mảng 2 chiều nên độ phức tạp thuật toán là rất cao (o^2n)
 * <p>
 * - Bubble Sort không thực sự hiệu quả kể cả khi với một mảng nhỏ, vì độ phức tạp quá lớn khi duyệt lần
 * lượt và so sánh 2 phần tử gần nhau => nên sử dụng các giải thuật tìm kiếm khác.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {2, 4, 5, 1, 6, 7, 3, 8, 9};

        bubbleSort(array);

        // In ra sau khi sắp xếp
        for (int i : array) {
            System.out.print(i);
        }

    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                // Duyệt mỗi 2 phần tử một để sắp xếp bubble sort, độ phức tạp o^(2n)
                if (array[j] < array[i]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }
}
