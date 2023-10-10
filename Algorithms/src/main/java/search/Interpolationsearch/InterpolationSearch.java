package search.Interpolationsearch;


public class InterpolationSearch {
    /**
     * - InterpolationSearch: Tìm kiếm nội suy mảng đã được sắp xếp.
     * Dù không được viết thành thư viện trong java nhưng có thể tự viết thành hàm dưới.
     *
     * - Interpolation Search là một thuật toán hiệu quả hơn binary search khi dãy sắp xếp phân phối đều,
     * hay có quy luật. Ví dụ 0,1,2,3... hay 2,4,6,8,... nếu dãy ngẫu nhiên sẽ phức tạp và không nhanh bằng
     * binary search.
     *
     * - Chỉ cần hiểu không nên áp dụng tìm kiếm nội suy, ở nhiều trường hợp tìm kiếm nội suy tạo vòng lặp while vô hạn và không cải thiện
     * quá nhiều so với tìm kiếm nhị phân
     */
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};

        int target = 7;
        int result = interpolationSearch(sortedArray, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }

    public static int interpolationSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            int pos = low + ((target - arr[low]) * (high - low) / (arr[high] - arr[low]));
            // 1. với low = 0 ==> pos = 0 + (7-1)*(9-0)/(11-1) ~~ 5
            // 2. với low = 6 ==> pos = 6 + (7-7)*(9-6)/(11-7) = 6

            // 1. arr[5] = 6, target = 7 ==> next
            // 2. arr[6] = 7, target = 7 ==> return index = 6
            if (arr[pos] == target) {
                return pos;
            }

            // 1. arr[5] = 6, target = 7 ==> low = 5 + 1  = 6, call while again
            if (arr[pos] < target) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }

        return -1; // Trả về -1 nếu không tìm thấy phần tử
    }
}
