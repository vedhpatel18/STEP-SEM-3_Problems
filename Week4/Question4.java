/*
@author Vedh
*/
import java.util.*;
class Question4{
    int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int x : nums) {
            sum = sum + x;
            if (map.containsKey(sum - k))
                count = count + map.get(sum - k);
            map.put(
                sum,
                map.getOrDefault(sum, 0) + 1
            );
        }
        return count;
    }
    public static void main(String[] args) {
        Question4 obj = new Question4();
        int[] nums = {1, 1, 1};
        System.out.println(obj.subarraySum(nums, 2));
    }
}