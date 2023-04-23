import java.util.Arrays;

/**
 * 两数之和
 * https://note.youdao.com/s/N8ORP7Cj
 */
public class day0423 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6}, 10)));
    }

    public static int[] solution(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; i++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
