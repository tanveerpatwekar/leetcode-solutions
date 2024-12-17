import java.util.HashMap;
import java.util.Map;

public class Two_sum_1 {

    /*
      Input: nums = [2,7,11,15], target = 9
      Output: [0,1]
      Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

    static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int num1=0, num2=0;

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement))
                return new int[] {map.get(complement), i};
            map.put(nums[i], i);
            num1=nums[i];
            num2=i;
        }
        int[] arr={num1, num2};
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {2,11,15,7};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("["+result[0] +", "+result[1]+"]");
    }
}
