package src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * https://note.youdao.com/s/N8ORP7Cj
 */
public class day0423 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6}, 10)));
        System.out.println(Arrays.toString(solution1(new int[]{1, 2, 3, 4, 5, 6}, 10)));
    }

    public static int[] solution(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }


    public static int[] solution1(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }


}
