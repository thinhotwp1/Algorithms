package search.binarysearch;

import java.util.Arrays;

public class BinarySearch {

    /**
     * - Binary Search: Tìm kiếm nhị phân mảng đã được sắp xếp.
     * Binary Search hoạt động theo cấu trúc: Chia đôi mảng và lấy ra phần tử ở giữa, so sánh với target cần tìm,
     * nếu lớn hơn thì tìm ở nửa bé hơn, nếu bé hơn thì tìm ở nửa lớn hơn, lặp lại việc lấy phần tử ở giữa và so
     * sánh với target tới khi tìm thấy target.
     *
     *  (Trong ví dụ dưới Ctrl vào hàm binarySearch(int[] a, int key) để xem cách hoạt động của tìm kiếm nhị phân).
     *
     * - Binary Search là một thuật toán hiệu quả với điều kiện đầu vào là 1 mảng đã được sắp xếp, thường đuược sử
     * dụng với mảng tĩnh hoặc ít thay đổi so với tình huống tìm kiếm.
     */
    public static void main(String[] args) {
        int array[] = new int[100];
        int target = -1;

        for (int i = 0; i < 100; i++) array[i] = i;

        // Ctrl to binarySearch(int[] a, int key) to see detail
        int index = Arrays.binarySearch(array, target);

        if (index != -1) {
            System.out.println("Index: " + index);
        } else {
            System.out.println("Not found!");
        }
    }

}
