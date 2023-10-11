package recursion;

import java.sql.SQLOutput;

/**
 * Recursion - Đệ quy giúp rất nhiều nếu sử dụng hợp lý và đúng case, giúp giải quyết những bài toán khó.
 * Nhưng đi kèm là nếu không sử dụng hợp lý sẽ gây chậm hơn và sử dụng nhiều bộ nhớ hơn.
 *
 * - Giải quyết 1 số vấn đề khó như tính toán logic theo quy luật, hay chuyển tiền thành chữ theo quy luật
 * 1001: một nghìn lẻ một đồng, 100.101: một trăm nghìn lẻ một đồng, ...
 */
public class Recursion {
    public static void main(String[] args) {

        System.out.println("Ví dụ 1: Bước số bước chân");
        walkStep(5);

        System.out.println("Ví dụ 2: Tính lũy thừa");
        System.out.println(tinhLuyThua(7));
    }

    private static void walkStep(int i) {
        if (i < 1) {
            return;
        }
        System.out.println("You take a step !");
        walkStep(i - 1);
    }

    private static int tinhLuyThua(int i) {
        if (i <= 1) {
            return 1;
        }
        return i * tinhLuyThua(i - 1); // return 7*6*...*1 = 5040
    }
}
